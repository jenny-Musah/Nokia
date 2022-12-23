package CompletedAssignment;

import java.util.Scanner;

public class Nokia {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.printf("1.PhoneBook%n2.Message%n3.Chat%n4.Call%n5.Tones%n6.Settings%n7.Call divert%n8.Games%n9.Calculation%n10.Reminders%n11.Clock%n12.Profiles%n13.Sim services%n14.To go Back%n");
        System.out.print("Enter menu number:");
        int number = input.nextInt();
        switch (number) {
            case 1:
                phoneBook();
                break;
            case 2:
                message();
                break;
            case 3:
                System.out.println("Chat");
                break;
            case 4:
                callRegister();
                break;
            case 5:
                tones();
            case 6:
                setting();
                break;
            case 7:
                System.out.println("Call divert");
                break;
            case 8:
                System.out.println("Games");
                break;
            case 9:
                System.out.println("Calculator");
                break;
            case 10:
                System.out.println("Reminders");
                break;
            case 11:
                clock();
                break;
            case 12:
                System.out.println("Profiles");
                break;
            case 13:
                System.out.println("SIM services");
                break;
            case 14:
            default:
                break;

        }

    }

    public static void phoneBook() {

        System.out.printf("1.Search%n2.Service Nos%n3.Add name%n4.Erase%n5.Edit%n6.Assign tone%n7.Send b'card%n8.Options%n");
        System.out.println("Enter number:");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("Search");
                break;
            case 2:
                System.out.println("Service Nos");
                break;
            case 3:
                System.out.println("Add name");
                break;
            case 4:
                System.out.println("Erase");
                break;
            case 5:
                System.out.println("Edit");
                break;
            case 6:
                System.out.println("Send b' card");
                break;
            case 7:
                System.out.println("Options");
                break;
            case 8:
                option();
                break;
            case 9:
                System.out.println("Speed dials");
                break;
            case 10:
                System.out.println("Voice tags");
                break;
            case 11:
            default:
                break;
        }
    }

    public static void option() {
        System.out.printf("1.Type of view%n2.Memory status%n");
        System.out.println("Enter number:");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("Type of view");
                break;
            case 2:
                System.out.println("Memory status");
                break;
            case 3:
            default:
                break;
        }
    }

    public static void message() {
        System.out.printf("1.Write messages%n2.Inbox%n3.Outbox%n4.Picture messages%n5.Templates%n6.Smileys%n7.Messages settings%n8.Info service%n9.Voice mailbox number%n10.Service command editor%n");
        System.out.println("Enter number:");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("Write messages");
                break;
            case 2:
                System.out.println("Inbox");
                break;
            case 3:
                System.out.println("Outbox");
                break;
            case 4:
                System.out.println("Pictures messages");
                break;
            case 5:
                System.out.println("Templates");
                break;
            case 6:
                System.out.println("Smileys");
                break;
            case 7:
                messageSettings();

                break;
            case 8:
                System.out.println("info service");
                break;
            case 9:
                System.out.println("Voice mailbox number");
                break;
            case 10:
                System.out.println("Service command editor");
                break;
            case 11:
            default:
                break;


        }
    }

    public static void messageSettings() {
        System.out.printf("1.Set%n2.Common%n");
        System.out.println("Enter number:");
        int number = input.nextInt();
        switch (number) {
            case 1:
                set();
                break;
            case 2:
                common();
                break;
            case 3:
            default:
                break;
        }

    }

    public static void set() {
        System.out.printf("1.Message center number%n2.Message sent as%n3.Message validity%n");
        System.out.println("Enter number:");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("Message center number");
                break;
            case 2:
                System.out.println("Message sent as");
                break;
            case 3:
                System.out.println("Message validity");
                break;
            case 4:
            default:
                break;


        }

    }

    public static void common() {
        System.out.printf("1.Delivery reports%n2.Reply via main center%n3.Character support");
        System.out.println("Enter number");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("Delivery reports");
                break;
            case 2:
                System.out.println("Reply via same center");
                break;
            case 3:
                System.out.println("Character support");
                break;
            case 4:
            default:
                break;
        }

    }

    public static void callRegister() {
        System.out.printf("1.Missed calls%n2.Received calls%n3.Dialled numbers%n4.Erase recent call lists%n");
        System.out.println("Enter number:");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("Missed calls");
                break;
            case 2:
                System.out.println("Received calls");
                break;
            case 3:
                System.out.println("Dialled numbers");
                break;
            case 4:
                System.out.println("Erase recent call lists");
                break;
            case 5:
                showCallDuration();
                break;
            case 6:
                showCallCosts();
                break;
            case 7:
                callsCostSettings();
                break;
            case 8:
                System.out.println("Prepaid credit");
                break;
            case 9:
            default:
                break;
        }
    }

    public static void showCallDuration() {
        System.out.printf("1.Last call duration%n2.All calls' duration%n3.Received calls' duration%n4.Dialled calls' duration%n5.Clear timers%n");
        System.out.println("Enter number:");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("Last call duration");
                break;
            case 2:
                System.out.println("All calls' duration");
                break;
            case 3:
                System.out.println("Received calls' duration");
                break;
            case 4:
                System.out.println("Dialled calls' duration");
                break;
            case 5:
                System.out.println("Clear timers");
                break;
            case 6:
            default:
                break;

        }
    }

    public static void showCallCosts() {
        System.out.printf("1.Last call cost%n2.All calls' cost%n3.Clear counters%n");
        System.out.println("Enter number:");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("Last call cost");
                break;
            case 2:
                System.out.println("All calls' cost");
                break;
            case 3:
                System.out.println("Clear counters");
                break;
            case 4:
            default:
                break;
        }
    }

    public static void callsCostSettings() {
        System.out.printf("1.Calls cost limit%n2.Show cost in%n");
        System.out.println("Enter number:");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("Calls cost limit");
                break;
            case 2:
                System.out.println("Show costs in");
                break;
            case 3:
            default:
                break;
        }
    }

    public static void tones() {
        System.out.printf("1.Ringing tone%n2.Ringing volume%n3.Incoming call alert%n4.Composer%n5.Message alert tone%n6.Keypad tone%n7.Warning and game tone%n8.Vibrating tone%n9.Screen saver%n");
        System.out.println("Enter number");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("Ringing tone");
                break;
            case 2:
                System.out.println("Ringing volume");
                break;
            case 3:
                System.out.println("Incoming call alert");
                break;
            case 4:
                System.out.println("Composer");
                break;
            case 5:
                System.out.println("Message alert tone");
                break;
            case 6:
                System.out.println("Keypad tone");
                break;
            case 7:
                System.out.println("Warning games tones");
                break;
            case 8:
                System.out.println("Vibrating alert");
                break;
            case 9:
                System.out.println("Screen saver");
                break;
            case 10:
            default:
                break;
        }
    }

    public static void setting() {
        System.out.printf("1.Call setting%n2.Phone setting%n3.Security settings%n4.Restore factory settings");
        System.out.println("Enter number");
        int number = input.nextInt();
        switch (number) {
            case 1:
                callSettings();
                break;
            case 2:
                phoneSettings();
                break;
            case 3:
                securitySettings();
                break;
            case 4:
                System.out.println("Restore factory settings");
                break;
            case 5:
            default:
                break;

        }
    }
    public static void callSettings(){
        System.out.printf("1.Automatic redial%n2.Speed dialling%n3.Call waiting options%n4.Own number sending%n5.Phone line in use%n6.Automatic answer%n");
        System.out.println("Enter number:");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("Automatic redial");
                break;
            case 2:
                System.out.println("Speed dialling");
                break;
            case 3:
                System.out.println("Call waiting options");
                break;
            case 4:
                System.out.println("Own number sending");
                break;
            case 5:
                System.out.println("Phone line in use");
                break;
            case 6:
                System.out.println("Automatic answer ");
                break;
            case 7:
            default:
                break;
        }
    }
    public static void phoneSettings() {
        System.out.printf("1.language%n2.Cell info display%n3.Welcome note%n4.Network selection%n5.lights%n6.Confirm SIM service actions%n");
        System.out.println("Enter number");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("Language");
                break;
            case 2:
                System.out.println("Cell info display");
                break;
            case 3:
                System.out.println("Welcome note");
                break;
            case 4:
                System.out.println("Network selection");
                break;
            case 5:
                System.out.println("Lights");
                break;
            case 6:
                System.out.println("Confirm SIM service actions");
                break;
            case 7:
            default:
                break;
        }
    }
    public static void securitySettings() {
        System.out.printf("1.PIN code request%n2.Call barring service%n3.Fix dialling%n4.Closed user group%n5.Phone security%n6.Change access codes%n");
        System.out.println("Enter number");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("PIN code request%");
                break;
            case 2:
                System.out.println("Call barring service");
                break;
            case 3:
                System.out.println("Fixed dialling");
                break;
            case 4:
                System.out.println("Closed user group");
                break;
            case 5:
                System.out.println("Phone security");
                break;
            case 6:
                System.out.println("Change access codes");
                break;
            case 7:
            default:
                break;
        }
    }
    public static void clock(){
        System.out.printf("1.Alarm clock%n2.Clock settings%n3.Date setting%n4.Stopwatch%n5.Countdown timer%n6.Auto update of date and time%n");
        System.out.println("Enter number:");
        int number = input.nextInt();
        switch(number){
            case 1:
                System.out.println("Alarm clock");
                break;
            case 2:
                System.out.println("Clock settings");
                break;
            case 3:
                System.out.println("Date setting");
                break;
            case 4:
                System.out.println("Stopwatch");
                break;
            case 5:
                System.out.println("Countdown timer");
                break;
            case 6:
                System.out.println("Auto update of date and time");
                break;
            case 7:
            default:
                break;
        }
    }
}
