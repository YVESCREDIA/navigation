package com.example.app3

class Datas {
    companion object {
        fun getCountries(): ArrayList<Country> {
            val countries = ArrayList<Country>()
            countries.add(
                Country(
                    "Inde",
                    "New Delhi",
                    "",
                    "Asie",
                    "L'Inde, en forme longue la république de l'Inde, en hindi Bhārat et Bhārat Gaṇarājya, est un pays d'Asie du Sud qui occupe la majeure partie du sous-continent indien. Sa capitale est New Delhi. Il partage des frontières terrestres avec le Pakistan au nord-ouest, la Chine, le Népal et le Bhoutan au nord, et le Bangladesh et la Birmanie à l'est. Une courte frontière commune avec l'Afghanistan est en cours de construction."
                )
            )
            countries.add(
                Country(
                    "Mexique",
                    "Mexico",
                    "R.drawable._2",
                    "Amérique",
                    "Le Mexique, en forme longue les États-Unis mexicains, en espagnol México et Estados Unidos Mexicanos, est un pays situé dans la partie méridionale de l'Amérique du Nord. Il possède plus de 6 000 km de frontière avec les États-Unis au nord et avec le Guatemala et le Belize au sud-est. Il est baigné à l'ouest par l'océan Pacifique et à l'est par le golfe du Mexique et la mer des Caraïbes."
                )
            )
            countries.add(
                Country(
                    "Congo",
                    "Brazzaville",
                    "",
                    "Afrique",
                    "Le Congo, en forme longue la république du Congo, est un pays d'Afrique centrale, situé de part et d'autre de l'équateur. Sa capitale est Brazzaville. Il est entouré par la République démocratique du Congo, la République centrafricaine, le Cameroun, le Gabon et l'océan Atlantique. Ancienne colonie française, le pays est membre de la francophonie."
                )
            )
            countries.add(
                Country(
                    "Canada",
                    "Ottawa",
                   " R.drawable._5",
                "Amérique",
                    "Le Canada est un pays situé dans la partie septentrionale de l'Amérique du Nord. Monarchie constitutionnelle fédérale à régime parlementaire, le Canada est composé de dix provinces et de trois territoires. Sa capitale est Ottawa et ses métropoles principales sont Toronto, Montréal et Vancouver. Le pays est une fédération qui est régie par un système parlementaire comprenant un monarque, un vice-roi, un premier ministre et un cabinet qui exerce le pouvoir exécutif. Le pouvoir législatif est partagé entre le monarque et les deux chambres du Parlement du Canada, soit la Chambre des communes et le Sénat. Le pouvoir judiciaire est indépendant des deux autres pouvoirs."
                )
            )
            return countries
        }
    }
}