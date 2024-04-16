@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String section;
    @ElementCollection
    @CollectionTable(name = "subject_marks")
    @MapKeyColumn(name = "subject")
    @Column(name = "marks")
    private Map<String, Integer> subjectMarks;
    // Getters and setters
}
