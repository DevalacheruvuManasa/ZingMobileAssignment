@Service
public class CollegeService {
    @Autowired
    private CollegeRepository collegeRepository;

    // Create
    public College createCollege(College college) {
        return collegeRepository.save(college);
    }

    // Read (all)
    public List<College> findAllColleges() {
        return collegeRepository.findAll();
    }

    // Read (single)
    public College findCollegeById(Long id) {
        return collegeRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "College not found"));
    }

    // Update
    public College updateCollege(Long id, College collegeDetails) {
        College college = findCollegeById(id);
        college.setName(collegeDetails.getName());
        college.setState(collegeDetails.getState());
        college.setCity(collegeDetails.getCity());
        college.setCampus(collegeDetails.getCampus());
        college.setSection(collegeDetails.getSection());
        return collegeRepository.save(college);
    }

    // Delete
    public void deleteCollege(Long id) {
        College college = findCollegeById(id);
        collegeRepository.delete(college);
    }
}
