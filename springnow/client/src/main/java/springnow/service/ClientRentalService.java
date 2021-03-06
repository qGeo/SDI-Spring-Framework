package springnow.service;

import org.springframework.beans.factory.annotation.Autowired;
import springnow.domain.Rental;
import springnow.service.CommonRentalService;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

public class ClientRentalService implements CommonRentalService {

    @Autowired
    private CommonRentalService rentalService;

    @Override
    public void deleteRentalsOfMovie(Long movieId) throws SQLException {
        rentalService.deleteRentalsOfMovie(movieId);

    }

    @Override
    public void deleteRentalsofClient(Long clientId) throws SQLException {

        rentalService.deleteRentalsofClient(clientId);
    }

    @Override
    public void rentMovie(Rental rental) {
        rentalService.rentMovie(rental);
    }

    @Override
    public void deleteRental(Long id) throws SQLException {
        rentalService.deleteRental(id);
    }

    @Override
    public void updateRental(Rental rental) {
        rentalService.updateRental(rental);
    }

    @Override
    public List<Rental> getAllRentals() throws SQLException {
        return rentalService.getAllRentals();
    }
}
