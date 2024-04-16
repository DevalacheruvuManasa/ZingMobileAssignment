public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findBySection(String section);
    Optional<Student> findByIdAndSection(Long id, String section);
}
