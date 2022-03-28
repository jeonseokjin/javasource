package interfacetest;

public class DaoExample {
		public static void dbWork(DataAccessObject dao) {
			dao.select();
			dao.insert();
			dao.update();
			dao.delete();
		}
		private void naub() {
			dbWork(new OracleDao());
			dwWork(new MySqlDao());
		}
}
