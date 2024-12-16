public class Main {
    public static void main(String[] args) {

        Genre genre1 = new Genre("Classical", "A genre known for its orchestral arrangements and timeless compositions");
        Genre genre2 = new Genre("Hip-Hop", "A genre that blends rhythmic speech with beats and sampling");
        Genre genre3 = new Genre("Electronic", "A genre characterized by synthesized sounds and digital effects");

        Author author1 = new Author("Emily", "Clark", 26, "Canada");
        Author author2 = new Author("Lucas", "Miller", 33, "Australia");
        Author author3 = new Author("Sophia", "Martinez", 29, "Mexico");

        Music music1 = new Music("Symphony No. 9", author1, genre1, 420, 5.49, 2022, "A classical masterpiece that resonates through the ages");
        Music music2 = new Music("Urban Beats", author2, genre2, 180, 2.79, 2018, "A mix of catchy rhythms and street-style lyrics");
        Music music3 = new Music("Electric Dreams", author3, genre3, 350, 3.99, 2021, "A mesmerizing electronic journey full of futuristic sounds");

        User user1 = new User("David", 22, "david@example.com", "Premium");
        User user2 = new User("Eva", 17, "eva@example.com", "Basic");
        User user3 = new User("George", 45, "george@example.com", "Premium");

        System.out.println(music1);
        System.out.println(music2);
        System.out.println(music3);

        user1.listenMusic(music1);
        user2.listenMusic(music2);
        user3.listenMusic(music3);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        System.out.println("Listens: " + music1.getListens());
        System.out.println("Listens: " + music2.getListens());
        System.out.println("Listens: " + music3.getListens());
    }
}
