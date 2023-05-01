

public class Main {
    public static void main(String[] args) {
        Service service = new ServiceImpl();
        service.inputData(ServiceImpl.list);
//        service.displayData(ServiceImpl.list);
        System.out.println(service.handle());
        }

    }

