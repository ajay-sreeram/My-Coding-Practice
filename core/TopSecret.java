class Secret
{
private void getSecret()
{}
void getSecret(int i)
{
getSecret();/*line x*/
}
protected void getTopSecret(String s)
{}/*line y*/
}

class TopSecret extends Secret
{
void getSecret()
{
super.getSecret();/*line a*/
}
public void getSecret(int i)
{
getSecret();/*line b*/
super.getSecret(i);/*line c*/
}
//private void getTopSecret(String s)
public void getTopSecret(String s)
{}/*line d*/
}