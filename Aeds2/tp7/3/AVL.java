/*
AEDs 2 1/2017
Nome:Otto Wilke Diniz Mariani Bittencourt
Matricula:504654
*/
import java.io.*;
import java.*;
import java.nio.charset.*;
import java.util.Formatter;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.UnsupportedEncodingException;

class MyIO {

	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in, Charset.forName("ISO-8859-1")));
	private static String charset = "ISO-8859-1";

	public static void setCharset(String charset_) {
		charset = charset_;
		in = new BufferedReader(new InputStreamReader(System.in, Charset.forName(charset)));
	}

	public static void print() {
	}

	public static void print(int x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(x);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
	}

	public static void print(double x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(x);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
	}

	public static void print(String x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(x);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
	}

	public static void print(boolean x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(x);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
	}

	public static void print(char x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(x);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
	}

	public static void println() {
	}

	public static void println(int x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.println(x);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
	}

	public static void println(double x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.println(x);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
	}

	public static void println(String x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.println(x);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
	}

	public static void println(boolean x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.println(x);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
	}

	public static void println(char x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.println(x);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
	}

	public static void printf(String formato, double x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.printf(formato, x);// "%.2f"
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
	}

	public static double readDouble() {
		double d = -1;
		try {
			d = Double.parseDouble(readString().trim().replace(",", "."));
		} catch (Exception e) {}
		return d;
	}

	public static double readDouble(String str) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(str);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
		return readDouble();
	}

	public static float readFloat() {
		return (float) readDouble();
	}

	public static float readFloat(String str) {
		return (float) readDouble(str);
	}

	public static int readInt() {
		int i = -1;
		try {
			i = Integer.parseInt(readString().trim());
		} catch (Exception e) {}
		return i;
	}

	public static int readInt(String str) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(str);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
		return readInt();
	}

	public static String readString() {
		String s = "";
		char tmp;
		try {
			do {
				tmp = (char)in.read();
				if (tmp != '\n' && tmp != ' ' && tmp != 13) {
					s += tmp;
				}
			} while (tmp != '\n' && tmp != ' ');
		} catch (IOException ioe) {
			System.out.println("lerPalavra: " + ioe.getMessage());
		}
		return s;
	}

	public static String readString(String str) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(str);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
		return readString();
	}

	public static String readLine() {
		String s = "";
		char tmp;
		try {
			do {
				tmp = (char)in.read();
				if (tmp != '\n' && tmp != 13) {
					s += tmp;
				}
			} while (tmp != '\n');
		} catch (IOException ioe) {
			System.out.println("lerPalavra: " + ioe.getMessage());
		}
		return s;
	}

	public static String readLine(String str) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(str);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
		return readLine();
	}

	public static char readChar() {
		char resp = ' ';
		try {
			resp  = (char)in.read();
		} catch (Exception e) {}
		return resp;
	}

	public static char readChar(String str) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(str);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
		return readChar();
	}


	public static boolean readBoolean() {
		boolean resp = false;
		String str = "";

		try {
			str = readString();
		} catch (Exception e) {}

		if (str.equals("true") || str.equals("TRUE") || str.equals("t") || str.equals("1") ||
		        str.equals("verdadeiro") || str.equals("VERDADEIRO") || str.equals("V")) {
			resp = true;
		}

		return resp;
	}

	public static boolean readBoolean(String str) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(str);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
		return readBoolean();
	}

	public static void pause() {
		try {
			in.read();
		} catch (Exception e) {}
	}

	public static void pause(String str) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(str);
		} catch (UnsupportedEncodingException e) { System.out.println("Erro: charset invalido"); }
		pause();
	}
}

class Arq {

	private static boolean write = false;
	private static boolean read = false;
	private static Formatter saida = null;
	private static Scanner entrada = null;

	public static boolean openWrite(String nomeArq) {
		boolean resp = false;

		close();

		try {
			saida = new Formatter(nomeArq);
			resp = write = true;
		}  catch (Exception e) {}

		return resp;
	}

	public static boolean openWrite(String nomeArq, String charset) {
		boolean resp = false;

		close();

		try {
			saida = new Formatter(nomeArq, charset);
			resp = write = true;
		}  catch (Exception e) {}

		return resp;
	}

	public static boolean openRead(String nomeArq) {
		boolean resp = false;

		close();

		try {
			entrada = new Scanner(new File(nomeArq));
			resp = read = true;
		}  catch (Exception e) {}

		return resp;
	}

	public static boolean openRead(String nomeArq, String charset) {
		boolean resp = false;

		close();

		try {
			entrada = new Scanner(new File(nomeArq), charset);
			resp = read = true;
		}  catch (Exception e) {}

		return resp;
	}

	public static void close() {
		if (write == true) {
			saida.close();
			write = false;
		}
		if (read == true) {
			entrada.close();
			read = false;
		}
	}

	public static void print(int x) {
		if (write == true) {
			saida.format( "%d", x);
		}
	}

	public static void print(double x) {
		if (write == true) {
			saida.format( "%f", x);
		}
	}

	public static void print(String x) {
		if (write == true) {
			saida.format( "%s", x);
		}
	}

	public static void print(boolean x) {
		if (write == true) {
			saida.format( "%s", ((x) ? "true" : "false"));
		}
	}

	public static void print(char x) {
		if (write == true) {
			saida.format( "%c", x);
		}
	}

	public static void println(int x) {
		if (write == true) {
			saida.format( "%d\n", x);
		}
	}

	public static void println(double x) {
		if (write == true) {
			saida.format( "%f\n", x);
		}
	}

	public static void println(String x) {
		if (write == true) {
			saida.format( "%s\n", x);
		}
	}

	public static void println(boolean x) {
		if (write == true) {
			saida.format( "%s\n", ((x) ? "true" : "false"));
		}
	}

	public static void println(char x) {
		if (write == true) {
			saida.format( "%c\n", x);
		}
	}

	public static int readInt() {
		int resp = -1;
		try {
			resp = entrada.nextInt();
		}  catch (Exception e) {}
		return resp;
	}

	public static char readChar() {
		char resp = ' ';
		try {
			resp = (char)entrada.nextByte();
		}  catch (Exception e) {}
		return resp;
	}

	public static double readDouble() {
		double resp = -1;
		try {
			resp = entrada.nextDouble();
		}  catch (Exception e) {}
		return resp;
	}

	public static String readString() {
		String resp = "";
		try {
			resp = entrada.next();
		}  catch (Exception e) { System.out.println(e.getMessage()); }
		return resp;
	}

	public static boolean readBoolean() {
		boolean resp = false;
		try {
			resp = (entrada.next().equals("true")) ? true : false;
		}  catch (Exception e) {}
		return resp;
	}

	public static String readLine() {
		String resp = "";
		try {
			resp = entrada.nextLine();
		}  catch (Exception e) { System.out.println(e.getMessage()); }
		return resp;
	}


	public static boolean hasNext() {
		return entrada.hasNext();
	}

	public static String readAll() {
		String resp = "";
		while (hasNext()) {
			resp += (readLine() + "\n");
		}
		return resp;
	}
}

class Muni {

	//--------------variaveisexternas.txt--------------------
	private int id; //A1
	private String nome; //A202
	private String uf; //A201
	private int codigoUf; //A200
	private String regiao; //A199
	private int populacao; //A204
	//--------------recursoshhumanos.txt----------------------
	private int numeroFuncionarios; //A2
	private int numeroComissionados; //A5
	//-------planejamentourbano.txt---------------------------
	private String escolaridade; //A16
	private int atualizacaoPlano; //A19
	//------------gestaoambiental.txt-------------------------
	private String estagio; //A143
	//-----------recursosparagestao.txt-----------------------
	private int atualizacaoCadastro; //A63
	//-------------articulacao--------------------------------
	private boolean consorcio; //A152

	/**
	 * construtor padrao
	 * @return [description]
	 */
	public Muni() {
	}

	/**
	 * construtor padrao 2
	 * @param  id                  id
	 * @param  nome                nome
	 * @param  uf                  uf
	 * @param  codigoUf            codigouf
	 * @param  populacao           populacao
	 * @param  numeroFuncionarios  numero funcionarios
	 * @param  numeroComissionados numero de comissionados
	 * @param  escolaridade        escoalridade
	 * @param  estagio             estagio
	 * @param  atualizacaoPlano    atualizacao do plano
	 * @param  regiao              regiao
	 * @param  atualizacaoCadastro atulaizacao do cadastro
	 * @param  consorcio           consorcio
	 * @return                     no return
	 */
	public Muni(int id, String nome, String uf, int codigoUf, int populacao, int numeroFuncionarios, int numeroComissionados, String escolaridade,
	            String estagio, int atualizacaoPlano, String regiao, int atualizacaoCadastro, boolean consorcio) {

		this.id = id;
		this.nome = nome;
		this.uf = uf;
		this.codigoUf = codigoUf;
		this.populacao = populacao;
		this.numeroFuncionarios = numeroFuncionarios;
		this.numeroComissionados = numeroComissionados;
		this.escolaridade = escolaridade;
		this.estagio = estagio;
		this.atualizacaoPlano = atualizacaoPlano;
		this.regiao = regiao;
		this.atualizacaoCadastro = atualizacaoCadastro;
		this.consorcio = consorcio;
	}

	/**
	 * metodo set do Id
	 * @param id [recebe valor a setar]
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public int getId() {
		return id;
	}

	/**
	 * metodo set do nome
	 * @param nome [recebe valor a setar]
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * metodo set do uf
	 * @param uf [recebe valor a setar]
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * metodo set do codigouf
	 * @param codigoUf [recebe valor a setar]
	 */
	public void setCodigoUf(int codigoUf) {
		this.codigoUf = codigoUf;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public int getCodigoUf() {
		return codigoUf;
	}

	/**
	 * metodo set
	 * @param populacao [recebe valor a setar]
	 */
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public int getPopulacao() {
		return populacao;
	}

	/**
	 * metodo set
	 * @param numeroFuncionarios [recebe valor a setar]
	 */
	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	/**
	 * metodo set
	 * @param numeroComissionados [recebe valor a setar]
	 */
	public void setNumeroComissionados(int numeroComissionados) {
		this.numeroComissionados = numeroComissionados;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public int getNumeroComissionados() {
		return numeroComissionados;
	}

	/**
	 * metodo set
	 * @param escolaridade [recebe valor a setar]
	 */
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public String getEscolaridade() {
		return escolaridade;
	}

	/**
	 * metodo set
	 * @param estagio [recebe valor a setar]
	 */
	public void setEstagio(String estagio) {
		this.estagio = estagio;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public String getEstagio() {
		return estagio;
	}

	/**
	 * metodo set
	 * @param atualizacaoPlano [recebe valor a setar]
	 */
	public void setAtualizacaoPlano(int atualizacaoPlano) {
		this.atualizacaoPlano = atualizacaoPlano;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public int getAtualizacaoPlano() {
		return atualizacaoPlano;
	}

	/**
	 * metodo set
	 * @param regiao [recebe valor a setar]
	 */
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public String getRegiao() {
		return regiao;
	}

	/**
	 * metodo set
	 * @param atualizacaoCadastro [recebe valor a setar]
	 */
	public void setAtualizacaoCadastro(int atualizacaoCadastro) {
		this.atualizacaoCadastro = atualizacaoCadastro;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public int getAtualizacaoCadastro() {
		return atualizacaoCadastro;
	}

	/**
	 * metodo set
	 * @param consorcio [recebe valor a setar]
	 */
	public void setConsorcio(boolean consorcio) {
		this.consorcio = consorcio;
	}

	/**
	 * metodo get
	 * @return retorno do valor do privado
	 */
	public boolean getConsorcio() {
		return consorcio;
	}

	/**
	 * metodo efetua um clone dos atributos
	 * @return retorno do colne
	 */
	public Muni clone() {

		Muni muni = new Muni();

		muni.setId(this.id);
		muni.setNome(this.nome);
		muni.setUf(this.uf);
		muni.setCodigoUf(this.codigoUf);
		muni.setPopulacao(this.populacao);
		muni.setNumeroFuncionarios(this.numeroFuncionarios);
		muni.setNumeroComissionados(this.numeroComissionados);
		muni.setEscolaridade(this.escolaridade);
		muni.setEstagio(this.estagio);
		muni.setAtualizacaoPlano(this.atualizacaoPlano);
		muni.setRegiao(this.regiao);
		muni.setAtualizacaoCadastro(this.atualizacaoCadastro);
		muni.setConsorcio(this.consorcio);

		return muni;
	}

	/**
	 * metodo de impressao
	 */
	public void imprimir() {

		MyIO.println(this.id + " " + this.nome + " " + this.uf + " " + this.codigoUf + " " + this.populacao + " " + this.numeroFuncionarios + " " +
		             this.numeroComissionados + " " + this.escolaridade + " " + this.estagio + " " + this.atualizacaoPlano + " " + this.regiao
		             + " " + this.atualizacaoCadastro + " " + this.consorcio);
	}

	/**
	 * metodo de leitura dos arquivos
	 * @param  linha     linha a ler
	 * @throws Exception tratamento de execao
	 */
	public void ler(int linha) throws Exception {

		String line = null;

		//leitura variaveis externas
		BufferedReader reader = new BufferedReader(new InputStreamReader(
		            new FileInputStream("/tmp/variaveisexternas.txt"), "ISO-8859-1"));

		line = reader.readLine();

		for (int i = 0; i < linha; i++) {
			line = reader.readLine();

		}
		String arrayVE[] = line.split("\t");
		this.id = Integer.parseInt(arrayVE[0]);
		this.regiao = arrayVE[1];
		this.codigoUf = Integer.parseInt(arrayVE[2]);
		this.uf = arrayVE[3];
		this.nome = arrayVE[4];
		this.populacao = Integer.parseInt(arrayVE[6]);

		reader.close();

		//planejamneto urbano
		BufferedReader reader2 = new BufferedReader(new InputStreamReader(
		            new FileInputStream("/tmp/planejamentourbano.txt"), "ISO-8859-1"));

		line = reader2.readLine();

		for (int i = 0; i < linha; i++) {
			line = reader2.readLine();

		}
		String arrayUrbano[] = line.split("\t");
		this.escolaridade = arrayUrbano[5];
		try {
			this.atualizacaoPlano = Integer.parseInt(arrayUrbano[8]);
		} catch (Exception e) {
			this.atualizacaoPlano = 0;
		}

		reader2.close();

		//recursos humanos
		BufferedReader reader3 = new BufferedReader(new InputStreamReader(
		            new FileInputStream("/tmp/recursoshumanos.txt"), "ISO-8859-1"));

		line = reader3.readLine();

		for (int i = 0; i < linha; i++) {
			line = reader3.readLine();
		}

		String arrayHumano[] = line.split("\t");
		this.numeroFuncionarios = Integer.parseInt(arrayHumano[4]);
		this.numeroComissionados = Integer.parseInt(arrayHumano[7]);

		reader3.close();

		//gestao ambiental
		BufferedReader reader4 = new BufferedReader(new InputStreamReader(
		            new FileInputStream("/tmp/gestaoambiental.txt"), "ISO-8859-1"));

		line = reader4.readLine();

		for (int i = 0; i < linha; i++) {
			line = reader4.readLine();
		}

		String arrayGestao[] = line.split("\t");
		this.estagio = arrayGestao[7];

		reader4.close();

		//recurso gestao
		BufferedReader reader5 = new BufferedReader(new InputStreamReader(
		            new FileInputStream("/tmp/recursosparagestao.txt"), "ISO-8859-1"));

		line = reader5.readLine();

		for (int i = 0; i < linha; i++) {
			line = reader5.readLine();
		}

		String arrayRecurso[] = line.split("\t");
		try {
			this.atualizacaoCadastro = Integer.parseInt(arrayRecurso[6]);
		} catch (Exception oa) {
			this.atualizacaoCadastro = 0;
		}

		reader5.close();

		//articulacao
		BufferedReader reader6 = new BufferedReader(new InputStreamReader(
		            new FileInputStream("/tmp/articulacaoointerinstitucional.txt"), "ISO-8859-1"));

		line = reader6.readLine();

		for (int i = 0; i < linha; i++) {
			line = reader6.readLine();
		}

		String arrayArticulacao[] = line.split("\t");

		if (arrayArticulacao[5].equals("Sim")) {
			this.consorcio = true;
		} else {
			this.consorcio = false;
		}

		reader6.close();
	}
}

class No {

	public Muni municipio; // Conteudo do no.
	public No esq, dir;  // Filhos da esq e dir.
	public int nivel;

	/**
	 * Construtor da classe.
	 * @param elemento Conteudo do no.
	 */
	public No(Muni municipio) {
		this(municipio, null, null, 1);
	}

	/**
	 * Construtor da classe.
	 * @param elemento Conteudo do no.
	 * @param esq No da esquerda.
	 * @param dir No da direita.
	 */
	public No(Muni municipio, No esq, No dir, int nivel) {
		this.municipio = municipio.clone();
		this.esq = esq;
		this.dir = dir;
		this.nivel = nivel;
	}

	public No setNivel() {
		this.nivel = 1 + Math.max(getNivel(esq), getNivel(dir));
		return this;
	}

	public static int getNivel (No no) {
		return (no == null) ? 0 : no.nivel;
	}
}

class ArvoreAVL {
	private No raiz; // Raiz da arvore.
	private int comps;

	/**
	 * Construtor da classe.
	 */
	public ArvoreAVL() {
		raiz = null;
	}

	public int getAltura() {
		return nivel(raiz) - 1;
	}

	private int nivel(No no) {
		return (no == null) ? 0 : (1 + Math.max(nivel(no.esq), nivel(no.dir)));
	}

	public int getComparacoes() {
		return comps;
	}

	/**
	 * Metodo publico iterativo para pesquisar elemento.
	 *
	 * @param elemento
	 *            Elemento que sera procurado.
	 * @return <code>true</code> se o elemento existir, <code>false</code> em
	 *         caso contrario.
	 */
	public void pesquisar(int elemento) {
		System.out.printf("raiz ");
		pesquisar(raiz, elemento);
	}

	/**
	 * Metodo privado recursivo para pesquisar elemento.
	 *
	 * @param no
	 *            No em analise.
	 * @param x
	 *            Elemento que sera procurado.
	 * @return <code>true</code> se o elemento existir, <code>false</code> em
	 *         caso contrario.
	 */
	private boolean pesquisar(No no, int x) {
		boolean resp;
		if (no == null) {
			comps++;
			resp = false;
			System.out.println("NAO");

		} else if (x == no.municipio.getId()) {
			comps++;
			resp = true;
			System.out.println("SIM");

		} else if (x < no.municipio.getId()) {
			comps++;
			System.out.printf("esq ");
			resp = pesquisar(no.esq, x);

		} else {
			System.out.printf("dir ");
			resp = pesquisar(no.dir, x);
		}
		return resp;
	}
	//================================================================================================================

	/**
	 * Metodo publico iterativo para pesquisar elemento.
	 *
	 * @param elemento
	 *            Elemento que sera procurado.
	 * @return <code>true</code> se o elemento existir, <code>false</code> em
	 *         caso contrario.
	 */
	public boolean pesquisarSeTem(Muni elemento) {
		return pesquisarSeTem(raiz, elemento);
	}

	/**
	 * Metodo privado recursivo para pesquisar elemento.
	 *
	 * @param no
	 *            No em analise.
	 * @param x
	 *            Elemento que sera procurado.
	 * @return <code>true</code> se o elemento existir, <code>false</code> em
	 *         caso contrario.
	 */
	private boolean pesquisarSeTem(No no, Muni x) {
		boolean resp;
		if (no == null) {
			comps++;
			resp = false;

		} else if (x.getId() == no.municipio.getId()) {
			comps++;
			resp = true;

		} else if (x.getId() < no.municipio.getId()) {
			comps++;
			resp = pesquisarSeTem(no.esq, x);

		} else {
			resp = pesquisarSeTem(no.dir, x);
		}
		return resp;
	}

	//=+====================================================================================================================

	/**
	 * Metodo publico iterativo para pesquisar elemento.
	 *
	 * @param elemento
	 *            Elemento que sera procurado.
	 * @return <code>true</code> se o elemento existir, <code>false</code> em
	 *         caso contrario.
	 */
	public boolean pesquisarExis(int elemento) {
		return pesquisarExis(raiz, elemento);
	}

	/**
	 * Metodo privado recursivo para pesquisar elemento.
	 *
	 * @param no
	 *            No em analise.
	 * @param x
	 *            Elemento que sera procurado.
	 * @return <code>true</code> se o elemento existir, <code>false</code> em
	 *         caso contrario.
	 */
	private boolean pesquisarExis(No no, int x) {
		boolean resp;
		if (no == null) {
			comps++;
			resp = false;

		} else if (x == no.municipio.getId()) {
			comps++;
			resp = true;

		} else if (x < no.municipio.getId()) {
			comps++;
			resp = pesquisarExis(no.esq, x);

		} else {
			resp = pesquisarExis(no.dir, x);
		}
		return resp;
	}

	//=====================================================================================================================

	/**
	 * Metodo publico iterativo para inserir elemento.
	 *
	 * @param x
	 *            Elemento a ser inserido.
	 * @throws Exception
	 *             Se o elemento existir.
	 */
	public void inserir(Muni x) throws Exception {
		raiz = inserir(raiz, x);
	}

	/**
	 * Metodo privado recursivo para inserir elemento.
	 *
	 * @param no
	 *            No em analise.
	 * @param x
	 *            Elemento a ser inserido.
	 * @return No em analise, alterado ou nao.
	 * @throws Exception
	 *             Se o elemento existir.
	 */
	private No inserir(No no, Muni x) throws Exception {
		if (no == null) {
			comps++;
			//System.out.println("Inserindo o " + x);
			no = new No(x);

		} else if (x.getId() < no.municipio.getId()) {
			comps++;
			//System.out.println("-> esq");
			no.esq = inserir(no.esq, x);

		} else if (x.getId() > no.municipio.getId()) {
			comps++;
			//System.out.println("-> dir");
			no.dir = inserir(no.dir, x);

		} else {

			throw new Exception("Erro ao inserir elemento (" + x + ")! ");
		}

		no = balancear(no);
		return no;
	}

	/**
	 * Metodo de balanceamento da arvore
	 * @param  no        no a ser balanceado
	 * @return           retorno
	 * @throws Exception erro
	 */
	private No balancear(No no) throws Exception {
		if (no != null) {
			comps++;
			int fator = No.getNivel(no.dir) - no.getNivel(no.esq);

			// Se balanceada
			if (Math.abs(fator) <= 1) {
				comps++;
				no = no.setNivel();

				// Se desbalanceada para a direita
			} else if (fator == 2) {
				comps++;
				int fatorFilhoDir = No.getNivel(no.dir.dir) - No.getNivel(no.dir.esq);

				// Se o filho a direita tambem estiver desbalanceado
				if (fatorFilhoDir == -1) {
					comps++;
					no.dir = rotacionarDir(no.dir);
				}
				no = rotacionarEsq(no);

				// Se desbalanceada para a esquerda
			} else if (fator == -2) {
				comps++;
				int fatorFilhoEsq = No.getNivel(no.esq.dir) - No.getNivel(no.esq.esq);

				// Se o filho a esquerda tambem estiver desbalanceado
				if (fatorFilhoEsq == 1) {
					comps++;
					no.esq = rotacionarEsq(no.esq);
				}
				no = rotacionarDir(no);

			} else {
				throw new Exception("Erro fator de balanceamento (" + fator + ") invalido!");
			}
		}

		return no;
	}

	private No rotacionarDir(No no) {
		//System.out.println("Rotacionar DIR(" + no.elemento + ")");
		No noEsq = no.esq;
		No noEsqDir = noEsq.dir;

		noEsq.dir = no;
		no.esq = noEsqDir;

		no.setNivel();
		noEsq.setNivel();

		return noEsq;
	}

	private No rotacionarEsq(No no) {
		//System.out.println("Rotacionar ESQ(" + no.elemento + ")");
		No noDir = no.dir;
		No noDirEsq = noDir.esq;

		noDir.esq = no;
		no.dir = noDirEsq;

		no.setNivel();
		noDir.setNivel();
		return noDir;
	}

	/**
	 * Metodo publico iterativo para remover elemento.
	 *
	 * @param elemento
	 *            Elemento a ser removido.
	 * @throws Exception
	 *             Se nao encontrar elemento.
	 */
	public void remover(int x) throws Exception {
		raiz = remover(raiz, x);
	}

	/**
	 * Metodo privado recursivo para remover elemento.
	 *
	 * @param no
	 *            No em analise.
	 * @param x
	 *            Elemento a ser removido.
	 * @return No em analise, alterado ou nao.
	 * @throws Exception
	 *             Se nao encontrar elemento.
	 */
	private No remover(No no, int x) throws Exception {

		if (pesquisarExis(x) == true) {
			if (no == null) {
				comps++;
				throw new Exception("Erro ao remover!");

			} else if (x < no.municipio.getId()) {
				comps++;
				no.esq = remover(no.esq, x);

			} else if (x > no.municipio.getId()) {
				comps++;
				no.dir = remover(no.dir, x);

				// Sem no a direita.
			} else if (no.dir == null) {
				comps++;
				no = no.esq;

				// Sem no a esquerda.
			} else if (no.esq == null) {
				comps++;
				no = no.dir;

				// No a esquerda e no a direita.
			} else {
				no.esq = antecessor(no, no.esq);
			}
			
		}
		no = balancear(no);
		return no;
	}

	/**
	 * Metodo para trocar no removido pelo antecessor.
	 *
	 * @param n1
	 *            No que teve o elemento removido.
	 * @param n2
	 *            No da subarvore esquerda.
	 * @return No em analise, alterado ou nao.
	 */
	private No antecessor(No n1, No n2) {

		// Existe no a direita.
		if (n2.dir != null) {
			comps++;
			// Caminha para direita.
			n2.dir = antecessor(n1, n2.dir);

			// Encontrou o maximo da subarvore esquerda.
		} else {
			n1.municipio = n2.municipio; // Substitui N1 por N2.
			n2 = n2.esq; // Substitui N2 por N2.ESQ.
		}
		return n2;
	}
}

class Log {

	/**
	 * metodo de criar log file
	 * @param countComp conta comparaçoes
	 * @param fim       tempo fim
	 * @param comeco    tempo comeco
	 */

	public static void createFile(int countComp, long fim, long comeco) {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("504654_avl.txt", "ISO-8859-1");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		writer.println("504654 \t " + " Tempo:" + (fim - comeco) / 1000.0 + "s  \t " + "Comparacoes:" + countComp);
		writer.close();
		//System.out.print(writer);


	}

} // log

class AVL {

	/**
	* Este metodo confere se uma String e igual a outra
	* @param str1 recebe uma String lida do aruivo
	* @param str2 recebe a palavra 'FIM'
	* @return cahrIgual()
	*/
	public static boolean isEquals ( String str1, String str2) {

		if ( str1.length() != str2.length() )
			return false;

		int i = 0;

		boolean charIgual = str1.charAt( i ) == str2.charAt( i );

		while ( ++i < str1.length() && charIgual )
			charIgual = str1.charAt( i ) == str2.charAt( i );

		return charIgual;
	}//fim isEquals()

	/**
	 * Metodo de tempo
	 * @return retono tempo
	 */
	public static long now() {
		return new Date().getTime();
	}

	public static void main(String[] args) throws Exception {

		long start = now();

		ArvoreAVL av = new ArvoreAVL();

		Muni muni = new Muni();

		Log log = new Log();

		String str = MyIO.readLine();

		while (Integer.parseInt(str) != 0) {
			muni.ler(Integer.parseInt(str));
			if (av.pesquisarSeTem(muni) == false) {
				av.inserir(muni);
			}
			//ab.mostrarPos();
			str = MyIO.readLine();
		}

		int size = Integer.parseInt(MyIO.readLine());

		for (int i = 0; i < size; i++) {

			str = MyIO.readLine();

			String arrayAux[] = str.split(" ");

			if (str.charAt(0) == 'I') {

				if (av.pesquisarSeTem(muni) == false) {
					muni.ler(Integer.parseInt(arrayAux[1]));
					av.inserir(muni);
				}
			} else if (str.charAt(0) == 'R') {

				av.remover(Integer.parseInt(arrayAux[1]));

			}
		}

		//ab.mostrarPre();




		str = MyIO.readLine();

		while (!isEquals(str, "FIM")) {

			int pesq = Integer.parseInt(str);
			av.pesquisar(pesq);
			str = MyIO.readLine();
		}

		long end = now();
		log.createFile(av.getComparacoes() , end , start);

	}
}