package Jay;

public class Main {
    public static void main(String[] args) {
        Cricket cricketTeam = new Cricket();
        int[] cricketAges = {26, 32, 36, 24, 31, 30, 35, 36, 21};
        cricketTeam.calculateAvgAge(cricketAges);

        Football footballTeam = new Football();
        int[] footballAges = {28, 32, 21, 27, 25, 24, 36, 31, 25, 23, 30};
        footballTeam.calculateAvgAge(footballAges);

        cricketTeam.retirePlayer(11);
        cricketTeam.retirePlayer(7);
        cricketTeam.retirePlayer(6);
        cricketTeam.retirePlayer(1);
        cricketTeam.retirePlayer(1); // Retire again to show the already retired message

        footballTeam.playerTransfer(659, 5);
    }
}

interface Sport {
    void calculateAvgAge(int[] age);
    void retirePlayer(int id);
}

class Cricket implements Sport {
    private int[] playerIDs;

    public Cricket() {
        playerIDs = new int[11];
        for (int i = 0; i < playerIDs.length; i++) {
            playerIDs[i] = 1;
        }
        System.out.println("A new cricket team has been formed");
    }

    @Override
    public void calculateAvgAge(int[] age) {
        double sum = 0;
        for (int a : age) {
            sum += a;
        }
        double avgAge = sum / age.length;
        System.out.printf("The average age of the team is %.2f%n", avgAge);
    }

    @Override
    public void retirePlayer(int id) {
        if (id < 1 || id > playerIDs.length) {
            System.out.println("Invalid player ID");
            return;
        }

        if (playerIDs[id - 1] == -1) {
            System.out.println("Player has already retired");
        } else {
            playerIDs[id - 1] = -1;
            System.out.println("Player with id: " + id + " has retired");
        }
    }
}

class Football implements Sport {
    private int[] playerIDs;

    public Football() {
        playerIDs = new int[11];
        for (int i = 0; i < playerIDs.length; i++) {
            playerIDs[i] = 1;
        }
        System.out.println("A new football team has been formed");
    }

    @Override
    public void calculateAvgAge(int[] age) {
        double sum = 0;
        for (int a : age) {
            sum += a;
        }
        double avgAge = sum / age.length;
        System.out.printf("The average age of the team is %.2f%n", avgAge);
    }

    @Override
    public void retirePlayer(int id) {
        if (id < 1 || id > playerIDs.length) {
            System.out.println("Invalid player ID");
            return;
        }

        if (playerIDs[id - 1] == -1) {
            System.out.println("Player has already retired");
        } else {
            playerIDs[id - 1] = -1;
            System.out.println("Player with id: " + id + " has retired");
        }
    }

    public void playerTransfer(int fee, int id) {
        if (id < 1 || id > playerIDs.length) {
            System.out.println("Invalid player ID");
            return;
        }

        if (playerIDs[id - 1] == -1) {
            System.out.println("Player has already retired");
        } else {
            playerIDs[id - 1] = 1; // Assuming transferring sets to 1 (or could set to a new ID)
            System.out.println("Player with id: " + id + " has been transferred with a fee of " + fee);
        }
    }
}


