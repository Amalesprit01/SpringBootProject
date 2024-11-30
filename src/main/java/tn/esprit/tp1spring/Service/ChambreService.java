package tn.esprit.tp1spring.Service;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tp1spring.Entity.Chambre;
import tn.esprit.tp1spring.Entity.TypeChambre;
import tn.esprit.tp1spring.Repository.ChambreRepo;
import tn.esprit.tp1spring.Service.Interfaces.IChambre;

import java.util.List;
@Service
@AllArgsConstructor
public class ChambreService implements IChambre {

    ChambreRepo chambreRepo;

    private ChambreService chambreService;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepo.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepo.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepo.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepo.findById(idChambre).get();
    }

    @Override
    public void removeChambre(long idChambre) {
        chambreRepo.deleteById(idChambre);
    }

    @Override
    public List<Chambre> GetChambresParNomUniversite(String nomUniversite) {
        return chambreRepo.findByBlocFoyerUniversiteNomuniversite(nomUniversite);
    }

    @Override
    public List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC) {
        return chambreRepo.findChambresByBlocAndType(idBloc, typeC);
    }

    @Override
    public List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre typeC) {
        return chambreRepo.findNonReservedChambresByNomUniversiteAndTypeChambre(nomUniversite, typeC);
    }

//    @Scheduled(cron = "*/30 * * * * *")
//    public void afficherChambresNonReservees() {
//        chambreService.afficherChambresNonReserveesPourToutesLesUniversites();
//    }
}
