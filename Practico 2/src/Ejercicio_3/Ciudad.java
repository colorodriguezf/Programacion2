package Ejercicio_3;

public class Ciudad {
    private String nombre;
    private long cant_habitantes;
    private long monto_por_imp1;
    private long monto_por_imp2;
    private long monto_por_imp3;
    private long monto_por_imp4;
    private long monto_por_imp5;
    private long gastos_realizados;

    public Ciudad (String nombre,long cant_habitantes, long monto_por_imp1, long monto_por_imp2, long monto_por_imp3, long monto_por_imp4, long monto_por_imp5, long gastos_realizados){
        setNombre(nombre);
        setCantHabitantes(cant_habitantes);
        setMontoPorImp1(monto_por_imp1);
        setMontoPorImp2(monto_por_imp2);
        setMontoPorImp3(monto_por_imp3);
        setMontoPorImp3(monto_por_imp3);
        setMontoPorImp4(monto_por_imp4);
        setGastosRealizados(gastos_realizados);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCantHabitantes() {
        return cant_habitantes;
    }

    public void setCantHabitantes(long cant_habitantes) {
        this.cant_habitantes = cant_habitantes;
    }

    public long getMontoPorImp1() {
        return monto_por_imp1;
    }

    public void setMontoPorImp1(long monto_por_imp1) {
        this.monto_por_imp1 = monto_por_imp1;
    }

    public long getMontoPorImp2() {
        return monto_por_imp2;
    }

    public void setMontoPorImp2(long monto_por_imp2) {
        this.monto_por_imp2 = monto_por_imp2;
    }

    public long getMontoPorImp3() {
        return monto_por_imp3;
    }

    public void setMontoPorImp3(long monto_por_imp3) {
        this.monto_por_imp3 = monto_por_imp3;
    }

    public long getMontoPorImp4() {
        return monto_por_imp4;
    }

    public void setMontoPorImp4(long monto_por_imp4) {
        this.monto_por_imp4 = monto_por_imp4;
    }

    public long getMontoPorImp5() {
        return monto_por_imp5;
    }

    public void setMontoPorImp5(long monto_por_imp5) {
        this.monto_por_imp5 = monto_por_imp5;
    }

    public long getGastosRealizados() {
        return gastos_realizados;
    }

    public void setGastosRealizados(long gastos_realizados) {
        this.gastos_realizados = gastos_realizados;
    }

     // Metodos
  /*
   * Estos son los metodos publicos que devuelven informacion relevante. 
   * 
  */
  public void agregarDineroAMonto1(long dinero){
    if(dinero >= 0){
      this.monto_por_imp1 += dinero;
    }
  }
  public void agregarDineroAMonto2(long dinero){
    if(dinero >= 0){
      this.monto_por_imp2 += dinero;
    }
  }
  public void agregarDineroAMonto3(long dinero){
    if(dinero >= 0){
      this.monto_por_imp3 += dinero;
    }
  }
  public void agregarDineroAMonto4(long dinero){
    if(dinero >= 0){
      this.monto_por_imp4 += dinero;
    }
}
public void agregarDineroAMonto5(long dinero){
  if(dinero >= 0){
    this.monto_por_imp5 += dinero;
  }
}
public void agregarDineroAGastosRealizados(long dinero){
  if(dinero >= 0){
    this.gastos_realizados += dinero;
  }
}

public long sumaTotalDeImpuestos(){
  return (getMontoPorImp1() + getMontoPorImp2() + getMontoPorImp3() + getMontoPorImp4() + getMontoPorImp5());
}
public boolean gastaMasDeLoQueRecauda(){
  return (getGastosRealizados() > sumaTotalDeImpuestos());
}
    

}
