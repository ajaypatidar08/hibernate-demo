package beans;

import java.util.Set;

public class Company
{
  private Integer cid;
  private String cname;
  private Set comp;
public Integer getCid() {
	return cid;
}
public void setCid(Integer cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Set getComp() {
	return comp;
}
public void setComp(Set comp) {
	this.comp = comp;
}
  
}
