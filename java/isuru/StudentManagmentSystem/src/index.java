import java.util.*;

public class index {
    public static void addNewStudent(String[] stID, String[] stName, int[] pfMarks, int[] dbMarks, int elementindex, int[] totalMarks, double[] average, int[][] rank, int[][] bestpf, int[][] bestdb) {
        //Heading
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|\t\t\t\t\tADD NEW STUDENT\t\t\t\t\t|");
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println();

        //Add student ID and Name
        L1:
        for (int i = elementindex; i < stID.length; i++) {
            L2:
            for (int j = 0; j < stID.length; j++) {
                System.out.print("Enter Student ID : ");
                String id = new Scanner(System.in).next();

                //Check the ID
                L3:
                for (int k = 0; k < stID.length; k++) {
                    if (id.equals(stID[k])) {
                        System.out.println("The Student ID already exists");
                        System.out.println();
                        continue L2;
                    }
                }
                stID[i] = id;
                break;
            }

            System.out.print("Enter Student Name : ");
            stName[i] = new Scanner(System.in).next();
            System.out.println();
            System.out.print("Student has been added successfully.\nDo you want to add a new student (Y/n): ");
            String answer = new Scanner(System.in).next();
            elementindex = i + 1;
            switch (answer) {
                case "Y":
                    continue L1;
                case "n":
                    clearConsole();
                    homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                    break;
                default:
                    clearConsole();
                    System.out.println("Invalied expresion please enter Y or n ");
                    homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                    break;
            }

        }
    }

    public static void marks(String[] stID, String[] stName, int[] pfMarks, int[] dbMarks, int elementindex, int[] totalMarks, double[] average, int[][] rank, int[][] bestpf, int[][] bestdb) {

        //Input pf marks and check
        L1:
        for (int i = elementindex; i < stID.length; i++) {
            L2:
            for (int k = elementindex; k < stID.length; k++) {
                System.out.print("Programming Fundamentals Marks : ");
                int marks1 = new Scanner(System.in).nextInt();
                if (marks1 >= 0 & marks1 <= 100) {
                    pfMarks[i] = marks1;
                    bestpf[i][2] = marks1;
                    totalMarks[i] += marks1;
                    break L1;
                } else {
                    System.out.println("Invalid marks, please enter correct marks.");
                }
            }
        }

        //Input DBMS marks and check
        L1:
        for (int i = elementindex; i < stID.length; i++) {
            L2:
            for (int L = elementindex; L < stID.length; L++) {
                System.out.print("Database Management System Marks : ");
                int marks2 = new Scanner(System.in).nextInt();
                if (marks2 >= 0 & marks2 <= 100) {
                    dbMarks[i] = marks2;
                    bestdb[i][2] = marks2;
                    totalMarks[i] += marks2;
                    rank[i][2] = totalMarks[i];
                    average[i] = (double) totalMarks[i] / 2;
                    break L1;
                } else {
                    System.out.println("Invalid marks, please enter correct marks.");
                    System.out.println();
                }
            }
        }
    }

    public static int searchStudent(String[] stID, String id) {
        int searchedIndex;
        //Search the index and return it
        for (searchedIndex = 0; searchedIndex < stID.length; searchedIndex++) {
            if (id.equals(stID[searchedIndex])) {
                return searchedIndex;

            }
        }
        searchedIndex = -1;
        return searchedIndex;
    }


    public static void addMarks(String[] stID, String[] stName, int[] pfMarks, int[] dbMarks, int elementindex, int[] totalMarks, double[] average, int[][] rank, int[][] bestpf, int[][] bestdb) {

        //Heading
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|\t\t\t\t\tADD MARKS\t\t\t\t\t|");
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println();

        //input student id
        A1:
        for (int j = 0; j < stID.length; j++) {
            System.out.print("Enter Student ID : ");
            String id = new Scanner(System.in).next();

            //Check the ID
            int searchedIndex = searchStudent(stID, id);
            if (searchedIndex >= 0) {
                System.out.println("Student name : " + stName[searchedIndex]);
                if (pfMarks[searchedIndex] > 0 || dbMarks[searchedIndex] > 0) {
                    System.out.println("This student's marks have been already added\nIf you want to update the marks, please use [4] Update marks option.");
                    System.out.println();
                    System.out.print("Do you want to add marks for another student? (Y/n)");
                    String answer = new Scanner(System.in).next();
                    switch (answer) {
                        case "Y":
                            continue A1;
                        case "n":
                            clearConsole();
                            homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                            break;
                        default:
                            clearConsole();
                            System.out.println("Invalied expresion please enter Y or n ");
                            homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                            break;
                    }
                } else {

                    //Input pf marks and check
                    L1:
                    for (int i = searchedIndex; i < stID.length; i++) {
                        L2:
                        for (int k = 0; k < stID.length; k++) {
                            System.out.print("Programming Fundamentals Marks : ");
                            int marks1 = new Scanner(System.in).nextInt();
                            if (marks1 >= 0 & marks1 <= 100) {
                                pfMarks[i] = marks1;
                                bestpf[i][2] = marks1;
                                totalMarks[i] += marks1;
                                break L1;
                            } else {
                                System.out.println("Invalid marks, please enter correct marks.");
                            }
                        }
                    }

                    //Input DBMS marks and check
                    L3:
                    for (int i = searchedIndex; i < stID.length; i++) {
                        L4:
                        for (int L = 0; L < stID.length; L++) {
                            System.out.print("Database Management System Marks : ");
                            int marks2 = new Scanner(System.in).nextInt();
                            if (marks2 >= 0 & marks2 <= 100) {
                                dbMarks[i] = marks2;
                                bestdb[i][2] = marks2;
                                totalMarks[i] += marks2;
                                L5:
                                for (int o = 0; o < elementindex; o++) {
                                    if (rank[o][1] == searchedIndex) {
                                        rank[o][2] = totalMarks[i];
                                        break L5;
                                    }
                                }
                                average[i] = (double) totalMarks[i] / 2;
                                break L3;
                            } else {
                                System.out.println("Invalid marks, please enter correct marks.");
                                System.out.println();
                            }
                        }
                    }

                    System.out.print("Marks have been added. Do you want to add marks for another student? (Y/n)");
                    String answer = new Scanner(System.in).next();
                    switch (answer) {
                        case "Y":
                            continue A1;
                        case "n":
                            clearConsole();
                            homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                            break;
                        default:
                            clearConsole();
                            System.out.println("Invalied expresion please enter Y or n ");
                            homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                            break;
                    }

                }
            } else if (searchedIndex == -1) {
                System.out.print("Invalid Student ID, Do you want to search again? (Y/n) ");
                String answer = new Scanner(System.in).next();
                switch (answer) {
                    case "Y":
                        continue A1;
                    case "n":
                        clearConsole();
                        homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                        break;
                    default:
                        clearConsole();
                        System.out.println("Invalied expresion please enter Y or n ");
                        homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                        break;
                }

            }
        }
    }

    public static void addNewStudentMarks(String[] stID, String[] stName, int[] pfMarks, int[] dbMarks, int elementindex, int[] totalMarks, double[] average, int[][] rank, int[][] bestpf, int[][] bestdb) {

        //Heading
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|\t\t\t\tADD NEW STUDENT WITH MARKS\t\t\t\t|");
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println();

        //Add student ID and Name
        L1:
        for (int i = elementindex; i < stID.length; i++) {
            L2:
            for (int j = 0; j < stID.length; j++) {
                System.out.print("Enter Student ID : ");
                String id = new Scanner(System.in).next();

                //Check the ID
                L3:
                for (int k = 0; k < stID.length; k++) {
                    if (id.equals(stID[k])) {
                        System.out.println("The Student ID already exists");
                        System.out.println();
                        continue L2;
                    }
                }
                stID[i] = id;
                break;
            }

            System.out.print("Enter Student Name : ");
            stName[i] = new Scanner(System.in).next();
            System.out.println();
            marks(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
            System.out.print("Student has been added successfully. \nDo you want to add a new student (Y/n): ");
            String answer = new Scanner(System.in).next();
            elementindex = i + 1;

            switch (answer) {
                case "Y":
                    continue L1;
                case "n":
                    clearConsole();
                    homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                    break;
                default:
                    clearConsole();
                    System.out.println("Invalied expresion please enter Y or n ");
                    homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                    break;
            }

        }
    }

    public static void updateStudentDetails(String[] stID, String[] stName, int[] pfMarks, int[] dbMarks, int elementindex, int[] totalMarks, double[] average, int[][] rank, int[][] bestpf, int[][] bestdb) {

        //Heading
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|\t\t\t\tUPDATE STUDENT DETAILS\t\t\t\t\t|");
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println();

        //input student id
        L2:
        for (int j = 0; j < stID.length; j++) {
            System.out.print("Enter Student ID : ");
            String id = new Scanner(System.in).next();

            //Check the ID
            int searchedIndex = searchStudent(stID, id);
            if (searchedIndex >= 0) {
                System.out.println("Student name : " + stName[searchedIndex]);
                System.out.println();
                System.out.print("Enter the new student name : ");
                stName[searchedIndex] = new Scanner(System.in).next();
                System.out.println();
                System.out.print("Student details has been updated successfully\nDo you want to add marks for another student? (Y/n)");
                String answer = new Scanner(System.in).next();
                switch (answer) {
                    case "Y":
                        continue L2;
                    case "n":
                        clearConsole();
                        homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                        break;
                    default:
                        clearConsole();
                        System.out.println("Invalied expresion please enter Y or n ");
                        homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                        break;
                }

            } else {
                System.out.print("Invalid Student ID, Do you want to search again? (Y/n) ");
                String answer = new Scanner(System.in).next();
                switch (answer) {
                    case "Y":
                        continue L2;
                    case "n":
                        clearConsole();
                        homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                        break;
                    default:
                        clearConsole();
                        System.out.println("Invalied expresion please enter Y or n ");
                        homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                        break;
                }
            }
        }
    }

    public static void updateStudentMarks(String[] stID, String[] stName, int[] pfMarks, int[] dbMarks, int elementindex, int[] totalMarks, double[] average, int[][] rank, int[][] bestpf, int[][] bestdb) {

        //Heading
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|\t\t\t\tUPDATE STUDENT MARKS\t\t\t\t\t|");
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println();

        //input student id
        L2:
        for (int j = 0; j < stID.length; j++) {
            System.out.print("Enter Student ID : ");
            String id = new Scanner(System.in).next();

            //Check the ID
            int searchedIndex = searchStudent(stID, id);
            if (searchedIndex >= 0) {
                System.out.println("Student name : " + stName[searchedIndex]);
                if (pfMarks[searchedIndex] == 0 || dbMarks[searchedIndex] == 0) {
                    System.out.println("This student's marks yet to be added");
                    System.out.print("Do you want to update the marks of another student? (Y/n)");
                    String answer = new Scanner(System.in).next();
                    switch (answer) {
                        case "Y":
                            continue L2;
                        case "n":
                            clearConsole();
                            homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                            break;
                        default:
                            clearConsole();
                            System.out.println("Invalied expresion please enter Y or n ");
                            homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                            break;
                    }
                } else {
                    System.out.println("Programming Fundamentals Marks : " + pfMarks[searchedIndex]);
                    System.out.println("Database Management System Marks : " + dbMarks[searchedIndex]);
                    System.out.println();
                    System.out.println();
                    marks(stID, stName, pfMarks, dbMarks, searchedIndex, totalMarks, average, rank, bestpf, bestdb);
                    System.out.print("Marks have been updated successfully.\nDo you want to add marks for another student? (Y/n)");
                    String answer = new Scanner(System.in).next();
                    switch (answer) {
                        case "Y":
                            continue L2;
                        case "n":
                            clearConsole();
                            homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                            break;
                        default:
                            clearConsole();
                            System.out.println("Invalied expresion please enter Y or n ");
                            homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                            break;
                    }

                }
            } else if (searchedIndex == -1) {
                System.out.print("Invalid Student ID, Do you want to search again? (Y/n) ");
                String answer = new Scanner(System.in).next();
                switch (answer) {
                    case "Y":
                        continue L2;
                    case "n":
                        clearConsole();
                        homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                        break;
                    default:
                        clearConsole();
                        System.out.println("Invalied expresion please enter Y or n ");
                        homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                        break;
                }
            }
        }

    }

    public static void deleteStudent(String[] stID, String[] stName, int[] pfMarks, int[] dbMarks, int elementindex, int[] totalMarks, double[] average, int[][] rank, int[][] bestpf, int[][] bestdb) {

        //Heading
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|\t\t\t\t\tDELETE STUDENT\t\t\t\t\t|");
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println();

        //input student id
        L2:
        for (int j = 0; j < stID.length; j++) {
            System.out.print("Enter Student ID : ");
            String id = new Scanner(System.in).next();

            //Check the ID
            int searchedIndex = searchStudent(stID, id);
            if (searchedIndex >= 0) {
                stID[searchedIndex] = null;
                stName[searchedIndex] = null;
                if (pfMarks[searchedIndex] > 0 || dbMarks[searchedIndex] > 0) {
                    pfMarks[searchedIndex] = 0;
                    dbMarks[searchedIndex] = 0;
                    bestpf[searchedIndex][2] = 0;
                    bestdb[searchedIndex][2] = 0;
                    totalMarks[searchedIndex] = 0;
                    average[searchedIndex] = 0.0;

                    for (int i = 0; i < elementindex; i++) {
                        rank[i][1] = i;
                        rank[i][2] = totalMarks[i];
                    }
                    for (int i = 0; i < elementindex; i++) {
                        bestpf[i][1] = i;
                        bestpf[i][2] = pfMarks[i];
                    }
                    for (int i = 0; i < elementindex; i++) {
                        bestdb[i][1] = i;
                        bestdb[i][2] = dbMarks[i];
                    }

                }

                System.out.print("Student has been deleted successfully.\nDo you want to delete another student? (Y/n)");
                String answer = new Scanner(System.in).next();
                switch (answer) {
                    case "Y":
                        continue L2;
                    case "n":
                        clearConsole();
                        homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                        break;
                    default:
                        clearConsole();
                        System.out.println("Invalied expresion please enter Y or n ");
                        homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                        break;
                }

            } else if (searchedIndex == -1) {
                System.out.print("Invalid Student ID, Do you want to search again? (Y/n) ");
                String answer = new Scanner(System.in).next();
                switch (answer) {
                    case "Y":
                        continue L2;
                    case "n":
                        clearConsole();
                        homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                        break;
                    default:
                        clearConsole();
                        System.out.println("Invalied expresion please enter Y or n ");
                        homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                        break;
                }
            }
        }
    }

    public static void printStudentdetails(String[] stID, String[] stName, int[] pfMarks, int[] dbMarks, int elementindex, int[] totalMarks, double[] average, int[][] rank, int[][] bestpf, int[][] bestdb) {

        //Heading
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|\t\t\t\tPRINT STUDENT DETAILS\t\t\t\t\t|");
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println();

        ranks(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank);

        //input student id
        L1:
        for (int j = 0; j < stID.length; j++) {
            System.out.print("Enter Student ID : ");
            String id = new Scanner(System.in).next();

            //Check the ID
            int rankf = 0;
            int searchedIndex = searchStudent(stID, id);
            if (searchedIndex >= 0) {
                System.out.println("Student name : " + stName[searchedIndex]);
                System.out.println();


                if (pfMarks[searchedIndex] > 0 || dbMarks[searchedIndex] > 0) {
                    average[searchedIndex] = (double) totalMarks[searchedIndex] / 2;

                    L2:
                    for (int k = 0; k < stID.length; k++) {
                        if (searchedIndex == rank[k][1]) {
                            rankf = rank[k][0];
                            break L2;
                        } else {
                            continue L2;
                        }

                    }
                    int min = rank[0][0];
                    for (int i = 1; i < elementindex; i++) {

                        if (rank[i][0] > min && rank[i][2] > 0) {
                            min = rank[i][0];
                        }
                    }

                    //Table
                    System.out.println("+-----------------------------------------------+--------------------+");
                    System.out.print("|Programming Fundamentals Marks\t\t\t|\t\t  ");
                    System.out.format("%3d|", pfMarks[searchedIndex]);
                    System.out.print("\n|Database management System Marks\t\t|\t\t  ");
                    System.out.format("%3d|", dbMarks[searchedIndex]);
                    System.out.print("\n|Total Marks\t\t\t\t\t|\t\t  ");
                    System.out.format("%3d|", totalMarks[searchedIndex]);
                    System.out.print("\n|Avg. Marks\t\t\t\t\t|\t\t ");
                    System.out.format("%4s|", average[searchedIndex]);
                    System.out.print("\n|Rank\t\t\t\t\t\t|\t    ");
                    if (rankf == 1) {
                        System.out.format("%9s", rankf + " (First)|");
                    } else if (rankf == 2) {
                        System.out.format("%10s", rankf + "(Second)|");
                    } else if (rankf == 3) {
                        System.out.format("%10s", rankf + " (Third)|");
                    } else if (rankf == min) {
                        System.out.format("%10s", rankf + " (Last)|");
                    } else {
                        System.out.format("%10s", "      " + rankf + "|");
                    }

                    System.out.println("\n+-----------------------------------------------+--------------------+");


                    System.out.println();
                    System.out.print("Do you want to add marks for another student? (Y/n)");
                    String answer = new Scanner(System.in).next();
                    switch (answer) {
                        case "Y":
                            continue L1;
                        case "n":
                            clearConsole();
                            homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                            break;
                        default:
                            clearConsole();
                            System.out.println("Invalied expresion please enter Y or n ");
                            homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                            break;
                    }
                } else {
                    System.out.println("Marks yet to be added");
                    System.out.print("Do you want to search another student details? (Y/n)");
                    String answer = new Scanner(System.in).next();
                    switch (answer) {
                        case "Y":
                            continue L1;
                        case "n":
                            clearConsole();
                            homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                            break;
                        default:
                            clearConsole();
                            System.out.println("Invalied expresion please enter Y or n ");
                            homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                            break;
                    }

                }
            } else if (searchedIndex == -1) {
                System.out.print("Invalid Student ID, Do you want to search again? (Y/n) ");
                String answer = new Scanner(System.in).next();
                switch (answer) {
                    case "Y":
                        continue L1;
                    case "n":
                        clearConsole();
                        homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                        break;
                    default:
                        clearConsole();
                        System.out.println("Invalied expresion please enter Y or n ");
                        homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                        break;
                }
            }
        }
    }

    public static void printStudentranks(String[] stID, String[] stName, int[] pfMarks, int[] dbMarks, int elementindex, int[] totalMarks, double[] average, int[][] rank, int[][] bestpf, int[][] bestdb) {

        //Heading
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|\t\t\t\tPRINT STUDENTS' RANKS\t\t\t\t\t|");
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println();

        //Make ranks
        ranks(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank);

        //Same total marks
        A1:
        for (int i = 0; i < elementindex; i++) {
            A2:
            for (int j = i + 1; j < elementindex; j++) {
                if (rank[i][2] == rank[j][2]) {
                    rank[j][0] = rank[i][0];
                } else {
                    continue A2;
                }
            }

        }

        //Table
        System.out.println("+-----+-----+-------------------+-----------+----------+");
        System.out.println("|Rank |ID   |Name\t\t|Total Marks|Avg. Marks|");
        System.out.println("+-----+-----+-------------------+-----------+----------+");

        String data = "|%-3d  |%-4s |%-15s\t|\t %3d|\t   %4s|%n";

        L1:
        for (int i = 0; i < elementindex; i++) {
            if (rank[i][2] > 0) {
                System.out.format(data, rank[i][0], stID[rank[i][1]], stName[rank[i][1]], totalMarks[rank[i][1]], average[rank[i][1]]);
            } else {
                continue L1;
            }

        }

        System.out.println("+-----+-----+-------------------+-----------+----------+");

        System.out.print("\nDo you want to go back to main menu? (Y/n) ");
        String answer = new Scanner(System.in).next();
        switch (answer) {
            case "Y":
                clearConsole();
                printStudentranks(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                break;
            case "n":
                clearConsole();
                homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                break;
            default:
                clearConsole();
                System.out.println("Invalied expresion please enter Y or n ");
                homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                break;
        }

    }


    public static void bestInDb(String[] stID, String[] stName, int[] pfMarks, int[] dbMarks, int elementindex, int[] totalMarks, double[] average, int[][] rank, int[][] bestpf, int[][] bestdb) {

        //Heading
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|\t\t\t\tBEST IN DATABASE MANAGEMENT SYSTEM\t\t\t|");
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println();

        //Sort the array in descending order
        int temp;
        for (int i = 0; i < elementindex; i++) {
            for (int j = i + 1; j < elementindex; j++) {
                if (bestdb[i][2] < bestdb[j][2]) {
                    temp = bestdb[i][2];
                    bestdb[i][2] = bestdb[j][2];
                    bestdb[j][2] = temp;
                    temp = bestdb[i][1];
                    bestdb[i][1] = bestdb[j][1];
                    bestdb[j][1] = temp;
                }
            }
        }

        //Table
        System.out.println("+-----+----------------------------+--------+");
        System.out.println("|ID   |Name\t\t|DBMS Marks|PF Marks|");
        System.out.println("+-----+----------------------------+--------+");

        String data = "|%-4s |%-15s\t|\t%3d|\t %3d|%n";

        L1:
        for (int i = 0; i < elementindex; i++) {
            if (bestdb[i][2] > 0) {
                System.out.format(data, stID[bestdb[i][1]], stName[bestdb[i][1]], bestdb[i][2], pfMarks[bestdb[i][1]]);
            } else {
                continue L1;
            }

        }

        System.out.println("+-----+----------------------------+--------+");

        System.out.print("\nDo you want to go back to main menu? (Y/n) ");
        String answer = new Scanner(System.in).next();
        switch (answer) {
            case "Y":
                clearConsole();
                bestInDb(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                break;
            case "n":
                clearConsole();
                homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                break;
            default:
                clearConsole();
                System.out.println("Invalied expresion please enter Y or n ");
                homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                break;
        }

    }

    public static void bestInPf(String[] stID, String[] stName, int[] pfMarks, int[] dbMarks, int elementindex, int[] totalMarks, double[] average, int[][] rank, int[][] bestpf, int[][] bestdb) {

        //Heading
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|\t\t\t\tBEST IN PROGRAMMING FUNDAMENTALS\t\t\t|");
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println();

        //Sort the array in descending order
        int temp;
        for (int i = 0; i < elementindex; i++) {
            for (int j = i + 1; j < elementindex; j++) {
                if (bestpf[i][2] < bestpf[j][2]) {
                    temp = bestpf[i][2];
                    bestpf[i][2] = bestpf[j][2];
                    bestpf[j][2] = temp;
                    temp = bestpf[i][1];
                    bestpf[i][1] = bestpf[j][1];
                    bestpf[j][1] = temp;
                }
            }
        }

        //Table
        System.out.println("+-----+--------------------------+----------+");
        System.out.println("|ID   |Name\t\t|PF Marks|DBMS Marks|");
        System.out.println("+-----+--------------------------+----------+");

        String data = "|%-4s |%-15s\t|     %3d|\t %3d|%n";

        L1:
        for (int i = 0; i < elementindex; i++) {
            if (bestpf[i][2] > 0) {
                System.out.format(data, stID[bestpf[i][1]], stName[bestpf[i][1]], bestpf[i][2], dbMarks[bestpf[i][1]]);
            } else {
                continue L1;
            }

        }

        System.out.println("+-----+--------------------------+----------+");

        System.out.print("\nDo you want to go back to main menu? (Y/n) ");
        String answer = new Scanner(System.in).next();
        switch (answer) {
            case "Y":
                clearConsole();
                bestInPf(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                break;
            case "n":
                clearConsole();
                homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                break;
            default:
                clearConsole();
                System.out.println("Invalied expresion please enter Y or n ");
                homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                break;
        }

    }

    public static void ranks(String[] stID, String[] stName, int[] pfMarks, int[] dbMarks, int elementindex, int[] totalMarks, double[] average, int[][] rank) {

        for (int i = 0; i < stID.length; i++) {
            rank[i][0] = i + 1;
        }

        //Sort the array in descending order
        int temp;
        for (int i = 0; i < elementindex; i++) {
            for (int j = i + 1; j < elementindex; j++) {
                if (rank[i][2] < rank[j][2]) {
                    temp = rank[i][2];
                    rank[i][2] = rank[j][2];
                    rank[j][2] = temp;
                    temp = rank[i][1];
                    rank[i][1] = rank[j][1];
                    rank[j][1] = temp;
                }
            }
        }
    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
            // Handle any exceptions.
        }
    }

    public static void homePage(String[] stID, String[] stName, int[] pfMarks, int[] dbMarks, int elementindex, int[] totalMarks, double[] average, int[][] rank, int[][] bestpf, int[][] bestdb) {

        //Homepage
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|\t\t\tWELCOME TO GDSE MARKS MANAGEMENT SYSTEM\t\t\t\t|");
        for (int i = 0; i < 89; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("[1] Add New Student\t\t\t[2]  Add New Student With Marks");
        System.out.println("[3] Add Marks\t\t\t\t[4]  Update Student Details");
        System.out.println("[5] Update Marks\t\t\t[6]  Delete Student");
        System.out.println("[7] Print Student Details\t\t[8]  Print Student Ranks");
        System.out.println("[9] Best in Programming Fundamentals\t[10] Best in Dtabase Management System");

        System.out.print("\nEnter an option to continue >");
        int option = new Scanner(System.in).nextInt();

        //Options
        switch (option) {
            case 1:
                clearConsole();
                addNewStudent(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                break;
            case 2:
                clearConsole();
                addNewStudentMarks(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                break;
            case 3:
                clearConsole();
                addMarks(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                break;
            case 4:
                clearConsole();
                updateStudentDetails(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                break;
            case 5:
                clearConsole();
                updateStudentMarks(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                break;
            case 6:
                clearConsole();
                deleteStudent(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                break;
            case 7:
                clearConsole();
                printStudentdetails(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                break;
            case 8:
                clearConsole();
                printStudentranks(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                break;
            case 9:
                clearConsole();
                bestInPf(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                break;
            case 10:
                clearConsole();
                bestInDb(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
                break;
            default:
                clearConsole();
                System.out.println("Invalied option");
                homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);
        }
    }

    public static void main(String[] args) {

        //Arrays
        String[] stID = new String[20];
        String[] stName = new String[20];
        int[] pfMarks = new int[20];
        int[] dbMarks = new int[20];
        int[] totalMarks = new int[20];
        double[] average = new double[20];
        int[][] rank = new int[20][3];
        int[][] bestpf = new int[20][3];
        int[][] bestdb = new int[20][3];

        for (int i = 0; i < stID.length; i++) {
            rank[i][0] = i + 1;
            rank[i][1] = i;
            bestpf[i][0] = i + 1;
            bestpf[i][1] = i;
            bestdb[i][0] = i + 1;
            bestdb[i][1] = i;

        }

        //Variable to store the element index
        int elementindex = 0;

        //Home page
        homePage(stID, stName, pfMarks, dbMarks, elementindex, totalMarks, average, rank, bestpf, bestdb);

    }

}

