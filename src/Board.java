import java.util.Scanner;

class Board {
    public Board() {
        o = new Out();
    }

    public void placeShip(int row, int startColumn) {
        if (row == 0) shipRow = "a";
        else if (row == 1) shipRow = "b";
        else if (row == 2) shipRow = "c";
        else if (row == 3) shipRow = "d";
        else if (row == 4) shipRow = "e";
        else if (row == 5) shipRow = "f";
        else if (row == 6) shipRow = "g";
        else if (row == 7) shipRow = "h";
        else if (row == 8) shipRow = "i";
        else if (row == 9) shipRow = "j";

        columnOne = startColumn;
        columnTwo = startColumn + 1;
    }

    public int checkWinStatus() {
        int hits = 0;
        switch (shipRow) {
            case "a":
                for (int idx = 0; idx < 10; ++idx) {
                    if (columnOne == idx && a[columnOne] == 5) ++hits;
                    if (columnTwo == idx && a[columnTwo] == 5) ++hits;
                }
                break;
            case "b":
                for (int idx = 0; idx < 10; ++idx) {
                    if (columnOne == idx && b[columnOne] == 5) ++hits;
                    if (columnTwo == idx && b[columnTwo] == 5) ++hits;
                }
                break;
            case "c":
                for (int idx = 0; idx < 10; ++idx) {
                    if (columnOne == idx && c[columnOne] == 5) ++hits;
                    if (columnTwo == idx && c[columnTwo] == 5) ++hits;
                }
                break;
            case "d":
                for (int idx = 0; idx < 10; ++idx) {
                    if (columnOne == idx && d[columnOne] == 5) ++hits;
                    if (columnTwo == idx && d[columnTwo] == 5) ++hits;
                }
                break;
            case "e":
                for (int idx = 0; idx < 10; ++idx) {
                    if (columnOne == idx && e[columnOne] == 5) ++hits;
                    if (columnTwo == idx && e[columnTwo] == 5) ++hits;
                }
                break;
            case "f":
                for (int idx = 0; idx < 10; ++idx) {
                    if (columnOne == idx && f[columnOne] == 5) ++hits;
                    if (columnTwo == idx && f[columnTwo] == 5) ++hits;
                }
                break;
            case "g":
                for (int idx = 0; idx < 10; ++idx) {
                    if (columnOne == idx && g[columnOne] == 5) ++hits;
                    if (columnTwo == idx && g[columnTwo] == 5) ++hits;
                }
                break;
            case "h":
                for (int idx = 0; idx < 10; ++idx) {
                    if (columnOne == idx && h[columnOne] == 5) ++hits;
                    if (columnTwo == idx && h[columnTwo] == 5) ++hits;
                }
                break;
            case "i":
                for (int idx = 0; idx < 10; ++idx) {
                    if (columnOne == idx && i[columnOne] == 5) ++hits;
                    if (columnTwo == idx && i[columnTwo] == 5) ++hits;
                }
                break;
            case "j":
                for (int idx = 0; idx < 10; ++idx) {
                    if (columnOne == idx && j[columnOne] == 5) ++hits;
                    if (columnTwo == idx && j[columnTwo] == 5) ++hits;
                }
                break;
        }


        String msg = "So far the number of hits you have is: " + hits;
        System.out.println(msg);
        return hits;
    }

    public void handleUserGuess() {
        boolean hit = false;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a coordinate eg. a5");
        String coord = userInput.nextLine();
        String row = coord.substring(0,1);
        int column = Integer.parseInt(coord.substring(1,2));

        o.msg("\n\nYou entered " + row + column + "\n");
        if (row.equals(shipRow)) {
            if (
                    (column == columnOne) ||
                            (column == columnTwo)
            ) {
                switch (row) {
                    case "a":
                        a[column] = 5;
                        hit = true;
                        break;
                    case "b":
                        b[column] = 5;
                        hit = true;
                        break;
                    case "c":
                        c[column] = 5;
                        hit = true;
                        break;
                    case "d":
                        d[column] = 5;
                        hit = true;
                        break;
                    case "e":
                        e[column] = 5;
                        hit = true;
                        break;
                    case "f":
                        f[column] = 5;
                        hit = true;
                        break;
                    case "g":
                        g[column] = 5;
                        hit = true;
                        break;
                    case "h":
                        h[column] = 5;
                        hit = true;
                        break;
                    case "i":
                        i[column] = 5;
                        hit = true;
                        break;
                    case "j":
                        j[column] = 5;
                        hit = true;
                        break;
                    default:
                        o.msg("You did not provide a valid column number");
                }
            }
        }
        if (column <= 9) {
            switch (row) {
                case "a":
                    a[column] = 1;
                    break;
                case "b":
                    b[column] = 1;
                    break;
                case "c":
                    c[column] = 1;
                    break;
                case "d":
                    d[column] = 1;
                    break;
                case "e":
                    e[column] = 1;
                    break;
                case "f":
                    f[column] = 1;
                    break;
                case "g":
                    g[column] = 1;
                    break;
                case "h":
                    h[column] = 1;
                    break;
                case "i":
                    i[column] = 1;
                    break;
                case "j":
                    j[column] = 1;
                    break;
            }
        }

        if (!hit) o.msg("That was a MISS!");
        else o.msg("That was a HIT!!! uh oh!!");
    }

    public void showBoard() {

        System.out.println("\n\n * * * * * GAME BOARD * * * * *");
        System.out.println("  0 1 2 3 4 5 6 7 8 9");

        System.out.print("a ");
        for (int idx = 0; idx <= 9; ++idx) {
            System.out.print(a[idx]);
            System.out.print(" ");
        }
        System.out.print("\nb ");
        for (int idx = 0; idx <=9; ++idx){
            System.out.print(b[idx]);
            System.out.print(" ");
        }
        System.out.print("\nc ");
        for (int idx = 0; idx <=9; ++idx){
            System.out.print(c[idx]);
            System.out.print(" ");
        }
        System.out.print("\nd ");
        for (int idx = 0; idx <=9; ++idx){
            System.out.print(d[idx]);
            System.out.print(" ");
        }
        System.out.print("\ne ");
        for (int idx = 0; idx <=9; ++idx){
            System.out.print(e[idx]);
            System.out.print(" ");
        }
        System.out.print("\nf ");
        for (int idx = 0; idx <=9; ++idx){
            System.out.print(f[idx]);
            System.out.print(" ");
        }
        System.out.print("\ng ");
        for (int idx = 0; idx <=9; ++idx){
            System.out.print(g[idx]);
            System.out.print(" ");
        }
        System.out.print("\nh ");
        for (int idx = 0;  idx <=9; ++idx){
            System.out.print(h[idx]);
            System.out.print(" ");
        }
        System.out.print("\ni ");
        for (int idx = 0; idx <=9; ++idx){
            System.out.print(i[idx]);
            System.out.print(" ");
        }
        System.out.print("\nj ");
        for (int idx = 0;idx  <=9; ++idx){
            System.out.print(j[idx]);
            System.out.print(" ");
        }
        System.out.println("\n\n");
    }

    Out o;
    public int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public int[] b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public int[] c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public int[] d = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public int[] e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public int[] f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public int[] g = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public int[] h = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public int[] i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public int[] j = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public String shipRow;
    public int columnOne;
    public int columnTwo;
}