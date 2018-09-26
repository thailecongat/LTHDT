import java.util.Scanner;

public class StudenManagement {
    public static void main(String args[]){
        Student a[] = new Student[3];
        String ten;
        String id;
        String email;
        String group;
        Scanner sc =new Scanner(System.in);
        for(int i=0 ; i<3 ; i++){
            a[i]= new Student();
            ten = sc.nextLine();
            id = sc.nextLine();
            email = sc.nextLine();
            group = sc.nextLine();
            a[i].setTen(ten);
            a[i].setId(id);
            a[i].setGroup(group);
            a[i].setEmail(email);
        }
    }
}
