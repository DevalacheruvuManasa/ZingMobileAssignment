public interface CollegeRepository extends JpaRepository<College, Long> {
    List<College> findByState(String state);
    List<College> findByCity(String city);
    List<College> findByCampus(String campus);
}
