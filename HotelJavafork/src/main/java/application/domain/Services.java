package application.domain;

import java.util.Scanner;

public class Services {

    Scanner sc = new Scanner(System.in);



   private int idService;
   private String serviceName;
   private int price;
   private String state;

   public Services(){

   }
   public Services (int id, String serviceName, int price, String state){

       this.idService = id;
       this.serviceName = serviceName;
       this.price = price;
       this.state = state;
   }

    public void setIdService(int idService) {
        this.idService = idService;
    }



    public int getIdService() {
        return idService;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public Services createSercice(Services services){


        System.out.println("Ingrese el nombre del servicio");
        String serviceName = sc.nextLine();
        services.serviceName = serviceName;

        System.out.println("Ingrese el apellido del huesped");
        int price = sc.nextInt();
        services.price = price;

        System.out.println("Ingrese el email del huesped");
        String state = sc.nextLine();
        services.state = state;


        return services;
    }
    public void getServiceById(int id , Services services){


        if(this.idService == id){
            System.out.println("Id:" + services.idService + "\n" +
                    "Nombre del sercicio: " + services.serviceName + "\n" +
                    "precio del servicio: " + services.price + "\n" +
                    "Estado del servicio: " + services.state + "\n");


        }else{
            System.out.println("Valide el id del huesped que esta consultando");
        }
        }
}
