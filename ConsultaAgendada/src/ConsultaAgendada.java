import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;

class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private String nomeMedico;
    static int quantidade;

    class Data {
    private int dia;
    private int mes;  
    private int ano;

      public Data() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        setDia(scanner.nextInt());
        System.out.println("Digite o mês: ");
        setMes(scanner.nextInt());
        System.out.println("Digite o ano: ");
        setAno(scanner.nextInt());
    }

    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void mostra1() {
        System.out.println(getDia() + "/" + getMes() + "/" + getAno());
    }

    public void mostra2() {
        System.out.println(getDia() + "/" + mesPorExtenso(getMes()) + "/" + getAno());
    }

    public boolean bissexto() {
        if (getAno() % 4 == 0 && getAno() % 100 != 0) {
            return true;
        } else if (getAno() % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String mesPorExtenso(int mes) {
        String mesPorExtenso = "";
        if (mes < 1 || mes > 12) {
            return "Mês inválido";
        }
        switch (mes) {
            case 1:
                mesPorExtenso = "Janeiro";
                break;
            case 2:
                mesPorExtenso = "Fevereiro";
                break;
            case 3:
                mesPorExtenso = "Março";
                break;
            case 4:
                mesPorExtenso = "Abril";
                break;
            case 5:
                mesPorExtenso = "Maio";
                break;
            case 6:
                mesPorExtenso = "Junho";
                break;
            case 7:
                mesPorExtenso = "Julho";
                break;
            case 8:
                mesPorExtenso = "Agosto";
                break;
            case 9:
                mesPorExtenso = "Setembro";
                break;
            case 10:
                mesPorExtenso = "Outubro";
                break;
            case 11:
                mesPorExtenso = "Novembro";
                break;
            case 12:
                mesPorExtenso = "Dezembro";
                break;
        }
        return mesPorExtenso;
    }

    public int diasTranscorridos() {
        int diasTranscorridos = 0;
        for (int i = 1; i < getMes(); i++) {
            diasTranscorridos += diasDoMes(i);
        }
        diasTranscorridos += getDia();
        return diasTranscorridos;
    }

    int diasDoMes(int mes) {
        int diasDoMes = 0;
        switch (mes) {
            case 1:
                diasDoMes = 31;
                break;
            case 2:
                if (bissexto()) {
                    diasDoMes = 29;
                } else {
                    diasDoMes = 28;
                }
                break;
            case 3:
                diasDoMes = 31;
                break;
            case 4:
                diasDoMes = 30;
                break;
            case 5:
                diasDoMes = 31;
                break;
            case 6:
                diasDoMes = 30;
                break;
            case 7:
                diasDoMes = 31;
                break;
            case 8:
                diasDoMes = 31;
                break;
            case 9:
                diasDoMes = 30;
                break;
            case 10:
                diasDoMes = 31;
                break;
            case 11:
                diasDoMes = 30;
                break;
            case 12:
                diasDoMes = 31;
                break;
        }
        return diasDoMes;
    }

    void apresentaDataAtual() {
        Date currentDate = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        String formattedDate = dateFormat.format(currentDate);
        System.out.println(formattedDate);
    }
}

class Hora {
    private int hora;
    private int min;
    private int seg;

    public Hora(int hora, int min, int seg) {
        hourSetException(hora);
        minSetException(min);
        segSetException(seg);
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public Hora() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a hora: ");
        setHora(scanner.nextInt());
        System.out.println("Digite o minuto: ");
        setMin(scanner.nextInt());
        System.out.println("Digite o segundo: ");
        setSeg(scanner.nextInt());
    }

    public void setHora(int hora) {
        hourSetException(hora);
        this.hora = hora;
    }

    public void setMin(int min) {
        minSetException(min);
        this.min = min;
    }

    public void setSeg(int seg) {
        segSetException(seg);
        this.seg = seg;
    }

    public int getHora() {
        return this.hora;
    }

    public int getMin() {
        return this.min;
    }

    public int getSeg() {
        return this.seg;
    }

    public String getHora1() {
        return String.format("%02d:%02d:%02d", this.hora, this.min, this.seg);
    }

    public String getHora2() {
        String ampm = "AM";
        int hora = this.hora;
        if (hora > 12) {
            hora -= 12;
            ampm = "PM";
        }
        return String.format("%02d:%02d:%02d %s", hora, this.min, this.seg, ampm);
    }

    public int getSegundosTotais() {
        return this.hora * 3600 + this.min * 60 + this.seg;
    }

    private void hourSetException(int hora) {
        if (hora < 0 || hora > 23) {
            throw new Error("Hora inválida");
        }
    }

    private void minSetException(int min) {
        if (min < 0 || min > 59) {
            throw new Error("Minuto inválido");
        }
    }

    private void segSetException(int seg) {
        if (seg < 0 || seg > 59) {
            throw new Error("Segundo inválido");
        }
    }
}

    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String nomePaciente, String nomeMedico) {
        quantidade++;
        Data data = new Data(d, m, a);
        Hora hora = new Hora(h, mi, s);
        setData(data);
        setHora(hora);
        setNomePaciente(nomePaciente);
        setNomeMedico(nomeMedico);
    }

    public ConsultaAgendada(Data data, Hora hora, String nomePaciente, String nomeMedico) {
        quantidade++;
        setData(data);
        setHora(hora);
        setNomePaciente(nomePaciente);
        setNomeMedico(nomeMedico);
    }

    public ConsultaAgendada() {
        Scanner scanner = new Scanner(System.in);
        quantidade++;
        System.out.println("Digite o nome do paciente: ");
        setNomePaciente(scanner.nextLine());
        System.out.println("Digite o nome do médico: ");
        setNomeMedico(scanner.nextLine());
        System.out.println("Digite o dia: ");
        int d = scanner.nextInt();
        System.out.println("Digite o mês: ");
        int m = scanner.nextInt();
        System.out.println("Digite o ano: ");
        int a = scanner.nextInt();
        Data data = new Data(d, m, a);
        setData(data);
        System.out.println("Digite a hora: ");
        int h = scanner.nextInt();
        System.out.println("Digite o minuto: ");
        int mi = scanner.nextInt();
        System.out.println("Digite o segundo: ");
        int s = scanner.nextInt();
        Hora hora = new Hora(h, mi, s);
        setHora(hora);
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setData() {
        Data data = new Data();
        this.data = data;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public void setHora() {
        Hora hora = new Hora();
        this.hora = hora;
    }

    public String getNomePaciente() {
        return this.nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public void setNomePaciente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do paciente: ");
        setNomePaciente(scanner.nextLine());
    }

    public String getNomeMedico() {
        return this.nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public void setNomeMedico() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do médico: ");
        setNomeMedico(scanner.nextLine());
    }

    public String getData() {
        return String.format("%02d/%02d/%02d", this.data.getDia(), this.data.getMes(), this.data.getAno());
    }

    public String getHora() {
        return String.format("%02d:%02d:%02d", this.hora.getHora(), this.hora.getMin(), this.hora.getSeg());
    }

    public static void main(String[] args) {
        ConsultaAgendada p1 = new ConsultaAgendada(15, 41, 0, 10, 10, 2021, "Kayky", "John");
        System.out.println("Paciente: " + p1.getNomePaciente());
        System.out.println("Médico: " + p1.getNomeMedico());
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        ConsultaAgendada p2 = new ConsultaAgendada();
        System.out.println("Paciente: " + p2.getNomePaciente());
        System.out.println("Médico: " + p2.getNomeMedico());
        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();
        System.out.println("Paciente: " + p1.getNomePaciente());
        System.out.println("Médico: " + p1.getNomeMedico());
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Quantidade de consultas: " + ConsultaAgendada.quantidade);
    }
}