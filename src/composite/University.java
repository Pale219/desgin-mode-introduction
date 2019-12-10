package composite;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent{
    private List<College> list;

    public University(String name, String desc) {
        super(name, desc);
        list = new ArrayList<>();
    }

    @Override
    public void add(OrganizationComponent organizationComponent) {
        if(organizationComponent instanceof College){
            list.add((College) organizationComponent);
        }
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        if(organizationComponent instanceof College){
            list.remove(organizationComponent);
        }
    }

    @Override
    public void print() {

    }
}
