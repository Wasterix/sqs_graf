package project;

public class DataProcessor {
    public void processInput(String inputName, String teamId, String inputSeason, String year) {
        System.out.print("Die Id der " + inputName + " lautet: " + teamId);
        System.out.print("Ausgewählte Saison: " + inputSeason + "/" + year);
    }

    public String calculateYear(String inputSeason) {
        String[] seasons = inputSeason.split("/");
        String year = seasons[0];

        return year;
    }
}

