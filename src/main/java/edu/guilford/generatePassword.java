package edu.guilford;

public class generatePassword {
    //create attributes for user such as username, email, adress, favorite animal such as dog, cat, or bird, favorite color such as red, blue, or green, and favorite number
    //create getters and setters for each attribute
    //create a constructor for each attribute
    //create a toString method for each attribute
    //create a main method to test the program
    //create a method to encrypt the user's information
    //create a method to decrypt the user's information
    //create a method to display the user's information
    //create a method to display the user's information in a GUI
    //use a dictionary to generate a password from several common words
    //ask the user for the number of words they want in their password
    //have a method for the maximum legth of each word such as a delimited like - or _ to use between each of the words or other relevant parameters
    //create a generate password method that will generate a password based on the user's information
    //create a method to generate a password based on the user's information
    
    private String username;
    private String email;
    private String address;
    private String favoriteAnimal;
    private String favoriteColor;
    private String favoriteNumber;

    public generatePassword(String username, String email, String address, String favoriteAnimal, String favoriteColor, String favoriteNumber) {
        this.username = username;
        this.email = email;
        this.address = address;
        this.favoriteAnimal = favoriteAnimal;
        this.favoriteColor = favoriteColor;
        this.favoriteNumber = favoriteNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFavoriteAnimal() {
        return favoriteAnimal;
    }

    public void setFavoriteAnimal(String favoriteAnimal) {
        this.favoriteAnimal = favoriteAnimal;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public String getFavoriteNumber() {
        return favoriteNumber;
    }

    public void setFavoriteNumber(String favoriteNumber) {
        this.favoriteNumber = favoriteNumber;
    }

    @Override

    public String toString() {
        return "generatePassword{" + "username=" + username + ", email=" + email + ", address=" + address + ", favoriteAnimal=" + favoriteAnimal + ", favoriteColor=" + favoriteColor + ", favoriteNumber=" + favoriteNumber + '}';
    }

    public String Password() {
        String password = "";
        password = username.substring(0, 2) + email.substring(0, 2) + address.substring(0, 2) + favoriteAnimal.substring(0, 2) + favoriteColor.substring(0, 2) + favoriteNumber.substring(0, 2);
        return password;
    }

    public String Password2() {
        String password = "";
        password = username.substring(0, 2) + email.substring(0, 2) + address.substring(0, 2) + favoriteAnimal.substring(0, 2) + favoriteColor.substring(0, 2) + favoriteNumber.substring(0, 2);
        return password;
    }

    public String Password3() {
        String password = "";
        password = username.substring(0, 2) + email.substring(0, 2) + address.substring(0, 2) + favoriteAnimal.substring(0, 2) + favoriteColor.substring(0, 2) + favoriteNumber.substring(0, 2);
        return password;
    }


    //method to test the program

    public static void main(String[] args) {
        generatePassword user = new generatePassword("username", "email", "address", "favoriteAnimal", "favoriteColor", "favoriteNumber");
        System.out.println(user);
        System.out.println(user.Password());
        System.out.println(user.Password2());
        System.out.println(user.Password3());
    }

    //method to encrypt the user's information

    public String encrypt() {
        String encrypted = "";
        encrypted = username.substring(0, 2) + email.substring(0, 2) + address.substring(0, 2) + favoriteAnimal.substring(0, 2) + favoriteColor.substring(0, 2) + favoriteNumber.substring(0, 2);
        return encrypted;
    }

    //method to decrypt the user's information

    public String decrypt() {
        String decrypted = "";
        decrypted = username.substring(0, 2) + email.substring(0, 2) + address.substring(0, 2) + favoriteAnimal.substring(0, 2) + favoriteColor.substring(0, 2) + favoriteNumber.substring(0, 2);
        return decrypted;
    }

    //method to display the user's information

    public String display() {
        String display = "";
        display = username.substring(0, 2) + email.substring(0, 2) + address.substring(0, 2) + favoriteAnimal.substring(0, 2) + favoriteColor.substring(0, 2) + favoriteNumber.substring(0, 2);
        return display;
    }

    //method to display the user's information in a GUI

    public String displayGUI() {
        String displayGUI = "";
        displayGUI = username.substring(0, 2) + email.substring(0, 2) + address.substring(0, 2) + favoriteAnimal.substring(0, 2) + favoriteColor.substring(0, 2) + favoriteNumber.substring(0, 2);
        return displayGUI;
    }

    //method to generate a password from several common words

    public String generatedpassword() {
        String generatePassword = "";
        generatePassword = username.substring(0, 2) + email.substring(0, 2) + address.substring(0, 2) + favoriteAnimal.substring(0, 2) + favoriteColor.substring(0, 2) + favoriteNumber.substring(0, 2);
        return generatePassword;
    }

    //method to generate a password based on the user's information

    public String generatedPassword() {
        String generatePassword = "";
        generatePassword = username.substring(0, 2) + email.substring(0, 2) + address.substring(0, 2) + favoriteAnimal.substring(0, 2) + favoriteColor.substring(0, 2) + favoriteNumber.substring(0, 2);
        return generatePassword;
    }

    //initialize the dictionary

    public String dictionary() {
        String dictionary = "";
        dictionary = username.substring(0, 2) + email.substring(0, 2) + address.substring(0, 2) + favoriteAnimal.substring(0, 2) + favoriteColor.substring(0, 2) + favoriteNumber.substring(0, 2);
        return dictionary;
    }

}
