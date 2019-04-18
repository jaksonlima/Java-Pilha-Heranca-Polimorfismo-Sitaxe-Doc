
public class TestaConexao {

	public static void main(String[] args) {

		try (Conexao conexao2 = new Conexao()) {
			conexao2.leDados();
		}catch(IllegalStateException ex) {
			System.out.println("Deu erro fechamento de conexao automatica");
		}
	}
}

//.........................................................................

//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu erro na conexao: " + ex + " manutenção imediata!!");
//			ex.getStackTrace();
//		} finally {
//			System.out.println("Finally");
//			if (con != null) {
//				con.fecha();
//			}
//
//		}
//	}
//
//}
