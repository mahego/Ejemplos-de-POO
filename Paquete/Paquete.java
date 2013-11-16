public class Paquete{
  private float pesoPaquete;
  private float precioGramo;
  private float totalEnvio;
  private String nombreRemitente;
  private String nombreDestinatario;

  public Paquete(){
    nombreRemitente = " ";
    nombreDestinatario = " ";
    pesoPaquete = 0.0F;
    precioGramo = 0.0F;
    totalEnvio = 0.0F;
  }

  public void setNombreRemitente(String nombreRemitente){
    this.nombreRemitente = nombreRemitente;
  }
  public void setNombreDestinatario(String nombreDestinatario) { 
  this.nombreDestinatario = nombreDestinatario; 
  } 
  public void setPesoPaquete(float pesoPaquete) {
    this.pesoPaquete = pesoPaquete;
  }

  public void validarOperacion(int t){
    if (t == 1)
      registrar();
    else if (t == 2)
      cobro();
    else if (t == 3)
      recibo();
  }

  public String getNombreRemitente(){
  return nombreRemitente;
  }
  public String getNombreDestinatario(){ 
  return nombreDestinatario;
  } 
  public float getPesoPaquete(){
  return pesoPaquete;
  }
  public float getTotalEnvio(){
  return totalEnvio; 
  }

  public void registrar(){
    getNombreRemitente();
    getNombreDestinatario();
  }
  public void cobro() { getPesoPaquete();
    asignaPrecio(); } 
  public void recibo() {
    calculoEnvio();
  }

  public void calculoEnvio() {
    totalEnvio = (pesoPaquete * precioGramo);
  }
  private void asignaPrecio() { 
  if (pesoPaquete < 1000.0F)
      precioGramo = 0.17F;
  else
      precioGramo = 0.39F;
  }
}