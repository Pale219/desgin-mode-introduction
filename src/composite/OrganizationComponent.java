package composite;

public abstract class OrganizationComponent {
    private String name;
    private String desc;

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }


    public void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    public abstract void print();
}
