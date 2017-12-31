/**
 * 
 */
package dnb.atm.utils;

/**
 * @author phuctd.lt
 *
 */
/*
 * @Configuration
 * 
 * @EnableWebSecurity public class SecurityConfiguration extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Autowired DataSource dataSource;
 * 
 * @Autowired public void configureGlobalSecurity(AuthenticationManagerBuilder
 * auth) throws Exception {
 * 
 * auth.inMemoryAuthentication().withUser("bill").password("abc123")
 * .roles("USER");
 * auth.inMemoryAuthentication().withUser("admin").password("root123")
 * .roles("ADMIN");
 * auth.inMemoryAuthentication().withUser("dba").password("root123")
 * .roles("ADMIN", "DBA");// dba have two roles. //
 * auth.jdbcAuthentication().dataSource(dataSource) .usersByUsernameQuery(
 * "select username,accountId from account where accountId=?")
 * .authoritiesByUsernameQuery(
 * "select accountId, role from trans_detail where accountId=?"); }
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.authorizeRequests().antMatchers("/welcome")
 * .access("hasRole('ADMIN')").anyRequest().permitAll().and()
 * .formLogin().loginPage("/login").usernameParameter("username")
 * .passwordParameter("password").and().logout()
 * .logoutSuccessUrl("/login?logout").and().exceptionHandling()
 * .accessDeniedPage("/getMoney").and().csrf(); }
 * 
 * }
 */
