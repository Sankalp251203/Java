class T4Q1 {
    private String universityName;

    public T4Q1(String universityName) {
        this.universityName = universityName;
    }
    public static class Library {
        private String libraryName;

        public Library(String libraryName) {
            this.libraryName = libraryName;
        }

        public void displayLibrary() {
            System.out.println("Library Name: " + libraryName);
        }
    }
    public class Department {
        private String departmentName;

        public Department(String departmentName) {
            this.departmentName = departmentName;
        }

        public void displayDepartment() {
            System.out.println("Department Name: " + departmentName);
        }
    }

    public static void main(String[] args) {
        T4Q1.Library library = new T4Q1.Library("Central Library");
        library.displayLibrary();

        T4Q1 university = new T4Q1("SRMIST");
        T4Q1.Department department = university.new Department("DSBS");
        department.displayDepartment();
    }
}
