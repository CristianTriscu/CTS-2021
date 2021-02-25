#include<iostream>
#include<string>
#include<fstream>
using namespace std;
enum luna {ian,feb,mar,apr,mai,iun,iul,aug,sep,oct,noi,dec};
class Credit {
	int codClinet;
	char * numeClient;
	double valoareCredit;
	int anStart;
protected:
	luna l;
	int nrRateLunare;//pozitiv sau null

public:
	Credit(const char *numeX, int codX) {
		if (codX > 1000)
			cout << "cod invalid" << endl;
		else
			this->codClinet = codX;
		if (strlen(numeX) > 100)
			cout << "nume invalid" << endl;
		else
		{
			this->numeClient = new char[30];
			strcpy(this->numeClient, numeX);
		}
		this->valoareCredit = 100;
		this->anStart = 2000;
		this->nrRateLunare = 2;
		this->l = ian;
	}
	Credit() {
		this->codClinet = 101;
		this->numeClient = new char[30];
		strcpy(this->numeClient, "Cristian");
		this->valoareCredit = 50;
		this->anStart = 2001;
		this->nrRateLunare = 3;
		this->l = mar;

	}
	Credit(const Credit& c) {
		this->codClinet = c.codClinet;
		this->numeClient = new char[30];
		strcpy(numeClient, c.numeClient);
		if (this->valoareCredit <500000)
			this->valoareCredit = c.valoareCredit;
		else
			cout << "nu se poate instantia un obiect cu creditul asa de mare";
		this->anStart = c.anStart;
		this->nrRateLunare = c.nrRateLunare;
		this->l = c.l;
	}

	Credit &operator=(const Credit& c) {
		if (this->codClinet<0)
			cout << "nu s-a produs copierea" << endl;
		else
			this->codClinet = c.codClinet;
		this->numeClient = new char[30];
		strcpy(numeClient, c.numeClient);
		this->valoareCredit = c.valoareCredit;
		this->anStart = c.anStart;
		this->nrRateLunare = c.nrRateLunare;
		this->l = c.l;
		return *this;
	}
	double get_valoare_credit() {
		return this->valoareCredit;
	}

// 4. Cod redundant, metode care nu sunt apelate niciodata
	int get_anStart() {
		return this->anStart;
	}
	int get_nr_rateLunare() {
		return this->nrRateLunare;
	}
	void set_nr_rateLunare(int x) {
		this->nrRateLunare = x;
	}
	void set_numeClient(char *x) {
		this->numeClient = new char[30];
		strcpy(numeClient, x);
	}

	friend ostream &operator<<(ostream &out, Credit &c) {
		out << c.anStart << endl;
		out << c.codClinet << endl;
		out << c.l << endl;
		out << c.nrRateLunare<<endl;
		out << c.numeClient << endl;
		out << c.valoareCredit << endl;
		return out;
	}

	bool operator<(Credit &c) {
		if (this->valoareCredit < c.valoareCredit)
			return true;
		else
			return false;
	}

	  operator int() {
		 return this->valoareCredit;
	}


	~Credit(){
		if (this->numeClient != NULL)
			delete[]this->numeClient;
		cout << "apel destructor"<<endl;
	}
};

class AlgoritmDobanda {
	virtual double calculDobanda() = 0;
};

class CreditNegociat :public Credit, public AlgoritmDobanda {
	double dobandaNegociata=4;
	double nrRateLunare=2;
	double *valoriRateLunare=NULL;

public:
	double calculDobanda() override{
		valoriRateLunare = new double[nrRateLunare];
		for (int i = 0; i < nrRateLunare; i++)
			this->valoriRateLunare[i] = this->get_valoare_credit() / nrRateLunare + dobandaNegociata;
	
		return *valoriRateLunare;
	}
	
	friend ostream &operator<<(ostream &out, CreditNegociat cred) {
		out << cred.dobandaNegociata<<endl;
		out << cred.nrRateLunare<<endl;
		for (int i = 0; i < cred.nrRateLunare; i++)
			out << cred.valoriRateLunare[i]<<" ";
		return out;
	}

	 double operator[] (int index){
		return this->valoriRateLunare[index];
	}
};


// 3. Clasele CreditNegociat/CreditBubventionat/AlgoritmDobanda trebuiau puse in fisiere separate, typo err in numele clasei (Subventionat)

class CreditBubventionat :public Credit, public AlgoritmDobanda {
	double dobandaNegociata = 4;
	double nrRateLunare = 2;
	double *valoriRateLunare = NULL;

public:
	double calculDobanda() override{
		valoriRateLunare = new double[nrRateLunare];
		for (int i = 0; i < nrRateLunare; i++)
			this->valoriRateLunare[i] = this->get_valoare_credit() / nrRateLunare;

		return *valoriRateLunare;
	}

	

	double operator[] (int index) {
		return this->valoriRateLunare[index];
	}

	
};
template<class B>
class CreditBubventionat1 {
	B dobandaNegociata = 4;
	B nrRateLunare = 2;
	B *valoriRateLunare = NULL;

public:
	CreditBubventionat1() {
		this->dobandaNegociata = 5;
	}

};
template <class T>
void sort(T nr_elemente, T a[]) {
	T i, aux;
	for (T i = 0; i < nr_elemente; i++)
		if (a[i] > a[i + 1])
		{
			aux = a[i];
			a[i] = a[i + 1];
			a[i + 1] = aux;
		}


}
int main() {

//4. cout uri folosite inutil/ cod redundant iar

	cout << "apel initializare obiecte"<<endl;
	Credit c1("George",100);
	Credit c2;
	Credit c3 = c1;
	Credit c4;
	c4 = c3;
	c1.set_nr_rateLunare(4);
	cout << c1.get_anStart() << c1.get_nr_rateLunare()<<endl;
	cout << c1;
	if (c1 < c2)
		cout << "creditul c1 este mai mic"<<endl;
	else
		cout << "Creditul c2 este mai mic " << endl;
	cout << int(c1);

	CreditNegociat credit_neg1;
	credit_neg1.calculDobanda();

//5. Comentarii fara sens

	
	//double *nou = new double[credit_neg1.get_nr_rateLunare];  
		//nou = credit_neg1.calculDobanda();

	cout << credit_neg1<<endl;
	cout << credit_neg1[1]<<endl;

// 1. Nu am folosit aceeasi conventie pentru numele variabilelor (initial am folosit camelCase)
// 2. variabile cu nume neintuitiv -> am declarat array uri cu numele vec, a 

	CreditBubventionat credit_bub2;
	credit_bub2.calculDobanda();
	Credit* vec = new Credit[2];
	vec[0] = credit_bub2;
	vec[1] = credit_neg1;
	for (int i = 0; i < 2; i++)
		cout << vec[i]<<endl;

	int nr_elemtnte = 3;
	int a[10] = { 4,2,7 };
	
	
	sort(nr_elemtnte, a);

	for (int i = 0; i < 10; i++)
		cout << a[i];

	CreditBubventionat1<int> obj1;
}
