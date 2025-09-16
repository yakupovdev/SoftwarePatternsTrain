package FactoryMethod;

import FactoryMethod.factory.Logistics;
import FactoryMethod.factory.PlaneLogistics;
import FactoryMethod.factory.ShipLogistics;
import FactoryMethod.factory.TrainLogistics;

import java.util.Scanner;

public class Main {
    private static Logistics logistics;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("""
                Choice transport:
                1. Train
                2. Plane
                3. Ship""");
        String choice = input.nextLine();

        choiceLogistics(choice);
        displayLogistics();


    }
    private static void choiceLogistics(String choice) {
        switch (choice) {
            case "1":
                logistics = new TrainLogistics();
                break;
                case "2":
                    logistics = new PlaneLogistics();
                    break;
                    case "3":
                        logistics = new ShipLogistics();
                        break;

        }

    }
    private static void displayLogistics() {
        logistics.planDelivery();
    }
}
