package datastructures;

public class Arrays {

    public static void main(String[] args) {
        String[] alphabet = {"a","b","c","d","e"};

        System.out.println("The old-fashioned way");
        for (int i=0; i<5; i++) {
            System.out.print(alphabet[i] + " ");
        }

        System.out.println("\nUsing the length variable");
        int size = alphabet.length;
        for (int i=0; i<size; i++) {
            System.out.print(alphabet[i] + " ");
        }

        System.out.println("\n\nUsing the foreach method");
        for (String letter : alphabet) {
            System.out.print(letter + " ");
        }

        // Define a 3x4 matrix
        String[][] users = {
                {"John", "Williams", "jw@testemail.com", "7058954444"},
                {"Sarah", "Jackson", "sj@testemail.com", "8941235666"},
                {"Rachel", "Wallace", "rw@testemail.com", "1238799854"}
        };

        // Get the size of the array
        System.out.println("\nDouble Arrays");
        int nUsers = users.length;
        int nFields = users[0].length;

        System.out.println("Number of users: " + nUsers);
        System.out.println("Number of fields: " + nFields);

        // Traverse the double array
        for (int i=0; i<nUsers; i++) {
            String firstName = users[i][0];
            String lastName = users[i][1];
            String email = users[i][2];
            String phone = users[i][3];

            System.out.println(firstName + " " + lastName + " " + email + " " + phone);
        }

        System.out.println("Using FOR EACH");
        for (String[] user : users) {
            System.out.print("[");
            for (String field : user) {
                System.out.print(field + " ");
            }
            System.out.println("]");
        }
    }
}
