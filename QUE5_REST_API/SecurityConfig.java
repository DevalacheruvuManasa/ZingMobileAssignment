@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/colleges/**").hasAnyRole("SUPER_ADMIN", "ADMIN", "TEACHER", "STUDENT")
                .antMatchers("/students/**").hasAnyRole("SUPER_ADMIN", "ADMIN", "TEACHER", "STUDENT")
                .and()
            .httpBasic()
                .and()
            .csrf().disable();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("admin").password("{noop}admin").roles("SUPER_ADMIN")
                .and()
                .withUser("teacher").password("{noop}teacher").roles("TEACHER")
                .and()
                .withUser("student").password("{noop}student").roles("STUDENT");
    }
}
