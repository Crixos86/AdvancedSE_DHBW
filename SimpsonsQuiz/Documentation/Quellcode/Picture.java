public void printPicture(String[] picture) {
    for (String line : picture) {
        System.out.println(line);
        try {
            Thread.sleep(300); // Pause between printing lines
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}