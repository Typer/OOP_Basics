package staticMembers.pr_05_SM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class AnimalClinicMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Animal> animals = new ArrayList<>();

        while (true){
            String[] inputAnimal = reader.readLine().trim().split("\\s+");
            if (inputAnimal[0].equals("End")){

                System.out.printf("Total healed animals: %d%n",AnimalClinic.healedAnimalsCount);
                System.out.printf("Total rehabilitated animals: %d%n",AnimalClinic.rehabilitedAnimalsCount);

                String type = reader.readLine();

                for (Animal animal : animals) {
                    if (animal.getHeald().equals(type)){
                        System.out.printf("%s %s%n",animal.getName(), animal.getBreed());
                    }
                }
                break;
            }

            String name = inputAnimal[0];
            String breed = inputAnimal[1];
            String diagnose = inputAnimal[2];

            animals.add(new Animal(name, breed, diagnose));

            switch (diagnose){
                case "heal":
                    AnimalClinic.healedAnimal();
                    System.out.printf("Patient %d: [%s (%s)] has been healed!%n",AnimalClinic.patientId, name, breed);
                    break;
                case "rehabilitate":
                    AnimalClinic.rehabilitedAnimal();
                    System.out.printf("Patient %d: [%s (%s)] has been rehabilitated!%n",AnimalClinic.patientId, name, breed);
                    break;
            }
        }
    }
}

