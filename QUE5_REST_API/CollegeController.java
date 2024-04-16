@RestController
@RequestMapping("/colleges")
public class CollegeController {
    @Autowired
    private CollegeService collegeService;

    // POST - Create a new college
    @PostMapping("/")
    public ResponseEntity<College> createCollege(@RequestBody College college) {
        return new ResponseEntity<>(collegeService.createCollege(college), HttpStatus.CREATED);
    }

    // GET - Read all colleges
    @GetMapping("/")
    public List<College> getAllColleges() {
        return collegeService.findAllColleges();
    }

    // GET - Read one college by id
    @GetMapping("/{id}")
    public ResponseEntity<College> getCollegeById(@PathVariable Long id) {
        return ResponseEntity.ok(collegeService.findCollegeById(id));
    }

    // PUT - Update a college
    @PutMapping("/{id}")
    public ResponseEntity<College> updateCollege(@PathVariable Long id, @RequestBody College college) {
        return ResponseEntity.ok(collegeService.updateCollege(id, college));
    }

    // DELETE - Delete a college
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCollege(@PathVariable Long id) {
        collegeService.deleteCollege(id);
        return ResponseEntity.noContent().build();
    }
}
