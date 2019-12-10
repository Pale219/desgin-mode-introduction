package composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{
    private List<Department> list;
    public College(String name, String desc) {
        super(name, desc);
        list = new ArrayList<>();
    }


    @Override
    public void add(OrganizationComponent organizationComponent) {
        if(organizationComponent instanceof Department){
            list.add((Department) organizationComponent);
        }else {
            System.out.println("error type");
        }
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        if(organizationComponent instanceof Department){
            list.remove(organizationComponent);
        }else {
            System.out.println("error type");
        }
    }

    @Override
    public void print() {

    }
}
