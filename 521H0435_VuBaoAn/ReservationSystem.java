import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;

public class ReservationSystem {
    private ArrayList<Accommodation> accommodations;

    // Requirement 1: Load data
    public ReservationSystem(String accPath, String roomPath, String roomOfAccPath) {
        this.accommodations = loadAccommodations(accPath, roomPath, roomOfAccPath);
    }

    public ArrayList<Accommodation> getAccommodations() {
        return accommodations;
    }

    // Requirement 1
    public ArrayList<Accommodation> loadAccommodations(String accPath, String roomPath, String roomOfAccPath) {
        /* Code here */
        ArrayList<Accommodation> accommodations = new ArrayList<>();
        Map<Integer, List<Room>> roomsMap = new HashMap<>();

        // Read
        try (BufferedReader roomReader = new BufferedReader(new FileReader(roomPath))) {
            String line;
            while ((line = roomReader.readLine()) != null) {
                String[] parts = line.split(",");
                int idRoom = Integer.parseInt(parts[0]);
                String nameRoom = parts[1];
                int numFloor = Integer.parseInt(parts[2]);
                String typeRoom = parts[3];
                int numBed = Integer.parseInt(parts[4]);
                int numMax = Integer.parseInt(parts[5]);
                double area = Double.parseDouble(parts[6]);
                double fee = Double.parseDouble(parts[7]);
                Room room = new Room(idRoom, nameRoom, numFloor, typeRoom, numBed, numMax, area, fee);

                roomsMap.putIfAbsent(idRoom, new ArrayList<>());
                roomsMap.get(idRoom).add(room);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<Integer, List<Integer>> accommodationRoomsMap = new HashMap<>();
        try (BufferedReader roomOfAccReader = new BufferedReader(new FileReader(roomOfAccPath))) {
            String line;
            while ((line = roomOfAccReader.readLine()) != null) {
                String[] parts = line.split(",");
                int accId = Integer.parseInt(parts[0]);
                int roomId = Integer.parseInt(parts[1]);
                accommodationRoomsMap.putIfAbsent(accId, new ArrayList<>());
                accommodationRoomsMap.get(accId).add(roomId);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader accReader = new BufferedReader(new FileReader(accPath))) {
            String line;
            while ((line = accReader.readLine()) != null) {
                String[] parts = line.split(",");
                int idAccom = Integer.parseInt(parts[0]);
                String nameAccom = parts[1];
                String addressAccom = parts[2];
                String cityAccom = parts[3];

                if (parts.length == 5) {
                    float rate = Float.parseFloat(parts[4]);
                    Homestay homestay = new Homestay(idAccom, nameAccom, addressAccom, cityAccom, rate);
                    accommodations.add(homestay);
                    // System.out.println("Loaded homestay: " + homestay);
                } else if (parts.length == 6) {
                    int numStar = Integer.parseInt(parts[4]);
                    float rate = Float.parseFloat(parts[5]);
                    Hotel hotel = new Hotel(idAccom, nameAccom, addressAccom, cityAccom, rate, numStar);
                    accommodations.add(hotel);
                    // System.out.println("Loaded hottel: " + hotel);
                } else if (parts.length == 7) {
                    int numStar = Integer.parseInt(parts[4]);
                    boolean isPool = "yes".equalsIgnoreCase(parts[5]);
                    float rate = Float.parseFloat(parts[6]);
                    Resort resort = new Resort(idAccom, nameAccom, addressAccom, cityAccom, rate, numStar, isPool);
                    accommodations.add(resort);
                } else if (parts.length == 10) {
                    boolean isPool = "yes".equalsIgnoreCase(parts[4]);
                    boolean isDrink = "yes".equalsIgnoreCase(parts[5]);
                    boolean isBreak = "yes".equalsIgnoreCase(parts[6]);
                    boolean isGym = "yes".equalsIgnoreCase(parts[7]);
                    int maxCus = Integer.parseInt(parts[8]);
                    int price = Integer.parseInt(parts[9]);
                    Villa villa = new Villa(idAccom, nameAccom, addressAccom, cityAccom, isPool, isDrink, isBreak,
                            isGym, maxCus, price);
                    accommodations.add(villa);
                    // System.out.println("Loaded homestay: " + villa);
                } else if (parts.length == 11) {
                    boolean isPool = "yes".equalsIgnoreCase(parts[4]);
                    boolean isDrink = "yes".equalsIgnoreCase(parts[5]);
                    boolean isBreak = "yes".equalsIgnoreCase(parts[6]);
                    boolean isGym = "yes".equalsIgnoreCase(parts[7]);
                    boolean isBar = "yes".equalsIgnoreCase(parts[8]);
                    int maxCus = Integer.parseInt(parts[9]);
                    int price = Integer.parseInt(parts[10]);
                    CruiseShip cruiseShip = new CruiseShip(idAccom, nameAccom, addressAccom, cityAccom, isPool, isDrink,
                            isBreak, isGym, maxCus, price, isBar);
                    accommodations.add(cruiseShip);
                }

                if (accommodationRoomsMap.containsKey(idAccom)) {
                    ArrayList<Room> rooms = new ArrayList<>();
                    for (int roomId : accommodationRoomsMap.get(idAccom)) {
                        rooms.addAll(roomsMap.getOrDefault(roomId, new ArrayList<>()));
                    }
                    Accommodation accommodation = accommodations.get(accommodations.size() - 1);
                    if (accommodation instanceof CommonAccommodation) {
                        ((CommonAccommodation) accommodation).setRooms(rooms);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return accommodations;
    }

    // Requirement 2
    public ArrayList<Accommodation> searchForRoom(String city, int numOfPeople) {
        /* Code here */
        ArrayList<Accommodation> search = new ArrayList<>();

        for (Accommodation accommodation : accommodations) {
            if (accommodation.getCityAccom().equalsIgnoreCase(city)) {
                if (accommodation instanceof CommonAccommodation) {
                    CommonAccommodation commonAcc = (CommonAccommodation) accommodation;
                    for (Room room : commonAcc.getRooms()) {
                        if (room.getNumMax() >= numOfPeople) {
                            search.add(accommodation);
                        }
                    }
                } else if (accommodation instanceof LuxuryAccommodation) {
                    LuxuryAccommodation luxuryAcc = (LuxuryAccommodation) accommodation;
                    if (luxuryAcc.getMaxCus() >= numOfPeople) {
                        search.add(accommodation);
                    }
                } else {
                    search.add(accommodation);
                }
            }
        }

        search.sort((a1, a2) -> {
            boolean isA1Luxury = a1 instanceof LuxuryAccommodation;
            boolean isA2Luxury = a2 instanceof LuxuryAccommodation;

            if (isA1Luxury && !isA2Luxury) {
                return -1;
            } else if (!isA1Luxury && isA2Luxury) {
                return 1;
            }

            return a1.getNameAccom().compareToIgnoreCase(a2.getNameAccom());
        });

        return search;
    }

    // Requirement 3
    public ArrayList<Accommodation> searchForRoomByRange(String reservationPath, double priceFrom, double priceTo,
            Date checkin, Date checkout, String city, int numOfPeople) {
        /* Code here */
        ArrayList<Accommodation> range = new ArrayList<>();

        Set<String> reservedRooms = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(reservationPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String accId = parts[1];
                String roomId = parts.length == 5 ? parts[2] : null;
                Date resCheckin = new Date(Long.parseLong(parts[parts.length - 2]) * 1000);
                Date resCheckout = new Date(Long.parseLong(parts[parts.length - 1]) * 1000);

                if (!(checkout.before(resCheckin) || checkin.after(resCheckout))) {
                    if (roomId != null) {
                        reservedRooms.add(accId + "-" + roomId);
                    } else {
                        reservedRooms.add(accId);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Accommodation accommodation : accommodations) {
            if (accommodation.getCityAccom().equalsIgnoreCase(city)) {
                if (accommodation instanceof CommonAccommodation) {
                    CommonAccommodation commonAcc = (CommonAccommodation) accommodation;
                    for (Room room : commonAcc.getRooms()) {
                        String roomKey = accommodation.getIdAccom() + "-" + room.getIdRoom();
                        if (room.getFee() >= priceFrom && room.getFee() <= priceTo &&
                                room.getNumMax() >= numOfPeople && room.getNumMax() - numOfPeople <= 2
                                && !reservedRooms.contains(roomKey)) {
                            range.add(accommodation);
                        }
                    }
                } else if (accommodation instanceof LuxuryAccommodation) {
                    LuxuryAccommodation luxuryAcc = (LuxuryAccommodation) accommodation;
                    String luxuryKey = String.valueOf(luxuryAcc.getIdAccom());
                    if (luxuryAcc.getPrice() >= priceFrom && luxuryAcc.getPrice() <= priceTo &&
                            luxuryAcc.getMaxCus() >= numOfPeople && luxuryAcc.getMaxCus() - numOfPeople <= 2
                            && !reservedRooms.contains(luxuryKey)) {
                        range.add(accommodation);
                    }
                }
            }
        }

        range.sort((a1, a2) -> a2.getNameAccom().compareToIgnoreCase(a1.getNameAccom()));
        return range;
    }

    // Requirement 4
    public ArrayList<Accommodation> searchInAdvance(String city, Integer numOfPeople, String roomType,
            Boolean privatePool, Integer starQuality, Boolean freeBreakfast, Boolean privateBar) {
        /* Code here */
        ArrayList<Accommodation> advances = new ArrayList<>();

        for (Accommodation accommodation : accommodations) {
            if (!accommodation.getCityAccom().equalsIgnoreCase(city)) {
                continue;
            }

            boolean matches = true;
            int validRoomCount = 0;

            if (accommodation instanceof CommonAccommodation) {
                CommonAccommodation commonAcc = (CommonAccommodation) accommodation;
                for (Room room : commonAcc.getRooms()) {
                    if (room.getNumMax() >= numOfPeople &&
                            (roomType == null || room.getTypeRoom().equalsIgnoreCase(roomType))) {
                        validRoomCount++;
                    }
                }
            } else if (accommodation instanceof LuxuryAccommodation) {
                LuxuryAccommodation luxuryAcc = (LuxuryAccommodation) accommodation;
                if (luxuryAcc.getMaxCus() >= numOfPeople) {
                    validRoomCount = 1;
                }
            } else {
                validRoomCount = 1;
            }

            if (!matches) {
                continue;
            }

            if (roomType != null && !(accommodation instanceof CommonAccommodation)) {
                matches = false;
            }

            if (privatePool != null) {
                if (accommodation instanceof Resort && ((Resort) accommodation).isPool() != privatePool) {
                    matches = false;
                } else if (accommodation instanceof Villa && ((Villa) accommodation).isPool() != privatePool) {
                    matches = false;
                } else if (accommodation instanceof CruiseShip
                        && ((CruiseShip) accommodation).isPool() != privatePool) {
                    matches = false;
                } else if (!(accommodation instanceof Resort || accommodation instanceof LuxuryAccommodation
                        || accommodation instanceof CruiseShip)) {
                    matches = false;
                }
            }

            if (starQuality != null) {
                if (accommodation instanceof Hotel && ((Hotel) accommodation).getNumStar() != starQuality) {
                    matches = false;
                } else if (accommodation instanceof Resort && ((Resort) accommodation).getNumStar() != starQuality) {
                    matches = false;
                } else if (!(accommodation instanceof Hotel || accommodation instanceof Resort)) {
                    matches = false;
                }
            }

            if (freeBreakfast != null) {
                if (accommodation instanceof Villa && ((Villa) accommodation).isBreak() != freeBreakfast) {
                    matches = false;
                } else if (accommodation instanceof CruiseShip
                        && ((CruiseShip) accommodation).isBreak() != freeBreakfast) {
                    matches = false;
                } else if (!(accommodation instanceof LuxuryAccommodation)) {
                    matches = false;
                }
            }

            if (privateBar != null) {
                if (accommodation instanceof CruiseShip && ((CruiseShip) accommodation).isBar() != privateBar) {
                    matches = false;
                } else if (!(accommodation instanceof CruiseShip)) {
                    matches = false;
                }
            }

            if (matches) {
                for (int i = 0; i < validRoomCount; i++) {
                    advances.add(accommodation);
                }
            }
        }

        return advances;
    }

    // Requirement 5
    public double performReservation(String reservationPath, Accommodation acc, Room room, Date checkin, Date checkout)
            throws Exception {
        /* Code here */
        List<Reservation> reservations = new ArrayList<>();
        int reservationIDLines = 0;
        boolean canWriteFile = true;
        double totalPayment = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(reservationPath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    int reservationId = Integer.parseInt(parts[0].trim());
                    int accId = Integer.parseInt(parts[1].trim());
                    int roomId = Integer.parseInt(parts[2].trim());
                    long checkinTimestamp = Long.parseLong(parts[3].trim());
                    long checkoutTimestamp = Long.parseLong(parts[4].trim());

                    Date checkinFromFile = new Date(checkinTimestamp * 1000L);
                    Date checkoutFromFile = new Date(checkoutTimestamp * 1000L);

                    reservations.add(new Reservation(reservationId, accId, roomId, checkinFromFile, checkoutFromFile));
                }
                reservationIDLines++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new Exception("Error reading reservation file", e);
        }

        for (Reservation reservation : reservations) {
            if (reservation.getAccId() == acc.getIdAccom() && reservation.getRoomId() == room.getIdRoom()) {
                if (!(checkout.before(reservation.getCheckin()) || checkin.after(reservation.getCheckout()))) {
                    canWriteFile = false;
                    throw new Exception("The room has already been booked during this time period");
                }
            }
        }

        if (canWriteFile) {
            long numOfDays = diffBetweenDays(checkin.getTime(), checkout.getTime());
            double totalCost = room.getFee() * numOfDays;
            double serviceCost = totalCost + totalCost * 0.08;
            totalPayment = serviceCost;

            int newReservationId = reservationIDLines + 1;
            String newReservation = String.format("%d,%d,%d,%d,%d", +newReservationId, acc.getIdAccom(),
                    room.getIdRoom(), checkin.getTime(), checkout.getTime());

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(reservationPath, true))) {
                bw.write(newReservation);
                bw.newLine();
            } catch (IOException e) {
                System.out.println("Error writing to reservation file: " + e.getMessage());
                throw new Exception("Error writing to reservation file", e);
            }
        }

        return totalPayment;
    }

    // Helper functions for req 5
    public long diffBetweenDays(long dateStart, long dateEnd) {
        Date date = new Date(dateStart * 1000);
        Date date1 = new Date(dateEnd * 1000);

        date = removeTime(date);
        date1 = removeTime(date1);

        long diff = Math.abs(date1.getTime() - date.getTime());
        long numOfDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        return numOfDays;
    }

    private Date removeTime(Date date) {
        long time = date.getTime();
        long timeWithoutTime = time - (time % (24 * 60 * 60 * 1000));
        return new Date(timeWithoutTime);
    }
}
