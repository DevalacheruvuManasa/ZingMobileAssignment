@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudentsBySection(String section) {
        return studentRepository.findBySection(section);
    }

    public Student getStudentByIdAndSection(Long id, String section) {
        return studentRepository.findByIdAndSection(id, section)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Student not found"));
    }
}
