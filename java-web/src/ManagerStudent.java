import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/ManagerStudend.html")
public class ManagerStudent extends HttpServlet {
	private int id;
	private String name;
	private int age;
	private String gender;
	private int phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public ManagerStudent() {
		super();
	};

	public ManagerStudent(int id, String name, int age, String gender, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	public String toString() {
		return "id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", phone=" + phone + "]";
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("table", "<table>\n" + "			<tr>\n" + "				<th>Company</th>\n"
				+ "				<th>Contact</th>\n" + "				<th>Country</th>\n" + "			</tr>\n"
				+ "			<tr>\n" + "				<td>Alfreds Futterkiste</td>\n"
				+ "				<td>Maria Anders</td>\n" + "				<td>Germany</td>\n" + "			</tr>\n"
				+ "			<tr>\n" + "				<td>Centro comercial Moctezuma</td>\n"
				+ "				<td>Francisco Chang</td>\n" + "				<td>Mexico</td>\n" + "			</tr>\n"
				+ "			<tr>\n" + "				<td>Ernst Handel</td>\n"
				+ "				<td>Roland Mendel</td>\n" + "				<td>Austria</td>\n" + "			</tr>\n"
				+ "			<tr>\n" + "				<td>Island Trading</td>\n"
				+ "				<td>Helen Bennett</td>\n" + "				<td>UK</td>\n" + "			</tr>\n"
				+ "			<tr>\n" + "				<td>Laughing Bacchus Winecellars</td>\n"
				+ "				<td>Yoshi Tannamuri</td>\n" + "				<td>Canada</td>\n" + "			</tr>\n"
				+ "			<tr>\n" + "				<td>Magazzini Alimentari Riuniti</td>\n"
				+ "				<td>Giovanni Rovelli</td>\n" + "				<td>Italy</td>\n" + "			</tr>\n"
				+ "			\n" + "		</table>");
	}

}
