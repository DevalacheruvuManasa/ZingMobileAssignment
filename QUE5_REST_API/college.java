@Entity
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     // Getters and setters are describing
    private Long id;
    private String name;
    private String state;
    private String city;
    private String campus;
    private String section;
   
}
