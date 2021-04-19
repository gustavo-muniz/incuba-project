package incubaproject
import core.*

class BootStrap {

    def init = { servletContext ->

        Role admin = Role.findByAuthority("ROLE_ADMIN");
		if (admin == null){
			admin = new Role(authority: "ROLE_ADMIN").save();
		}
		User administrator = User.findByUsername("administrator");
		if (administrator == null){
			administrator = new User(username: "administrator", password: "123", 
				enabled: true, accountExpired: false, accountLocked: false, 
				passwordExpired: false).save();
		}
		if (UserRole.findByUserAndRole(administrator,admin) == null)
		{
			new UserRole(user: administrator, role: admin).save();
		}
    }
    def destroy = {
    }
}
