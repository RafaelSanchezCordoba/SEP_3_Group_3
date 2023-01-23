package com.example.t3_spring_dbserver.GrpcImpl;
import com.example.t3_spring_dbserver.entity.ProductCard;
import com.example.t3_spring_dbserver.service.ProductCardService;
<<<<<<< Updated upstream
import com.protoBuff.ProductCardComunicator;
import com.protoBuff.ProductCardComunicator.StringReqCard;
=======

>>>>>>> Stashed changes
import com.protoBuff.ProductCardComunicator.productCard;
import com.protoBuff.ProductCardComunicator.Empty;
import com.protoBuff.ProductCardComunicator.IntReqCard;
import com.protoBuff.ProductCardGrpcGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@GRpcService
public class ProductCardComunicatorImpl extends ProductCardGrpcGrpc.ProductCardGrpcImplBase {

    @Autowired
    private ProductCardService service;

    @Override
    public void addSocksCard(productCard request, StreamObserver<productCard> responseStream) {
        System.out.println("Received req to save sock card with id::"+ request.getId());

        ProductCard card = new ProductCard(request.getTitle(), request.getDescription(), request.getPrice(), request.getMaterial(), request.getBrand(), request.getImage(), request.getType(), "sock");
        service.saveCard(card);
        responseStream.onNext(productCard.newBuilder()
                .setTitle(card.getTitle())
                .setDescription(card.getDescription())
                .setPrice(card.getPrice())
                .setMaterial(card.getMaterial())
                .setBrand(card.getBrand())
                .setImage(card.getImage())
                .setType(card.getType())
                .build());
        responseStream.onCompleted();
    }

    @Override
    public void addTrouserCard(productCard request, StreamObserver<productCard> responseStream) {
        System.out.println("Received req to save trouser card with id::"+ request.getId());

        ProductCard card = new ProductCard(request.getTitle(), request.getDescription(), request.getPrice(), request.getMaterial(), request.getBrand(), request.getImage(), request.getType(), "trouser");
        service.saveCard(card);
        responseStream.onNext(productCard.newBuilder()
                .setTitle(card.getTitle())
                .setDescription(card.getDescription())
                .setPrice(card.getPrice())
                .setMaterial(card.getMaterial())
                .setBrand(card.getBrand())
                .setImage(card.getImage())
                .setType(card.getType())
                .build());
        responseStream.onCompleted();
    }

    @Override
    public void getById(IntReqCard request, StreamObserver<productCard> responseStream) {
        System.out.println("Received req to get product card with id::"+ request.getRequest());

        ProductCard card = service.getById(request.getRequest());
        responseStream.onNext(productCard.newBuilder()
                .setTitle(card.getTitle())
                .setDescription(card.getDescription())
                .setPrice(card.getPrice())
                .setMaterial(card.getMaterial())
                .setBrand(card.getBrand())
                .setImage(card.getImage())
                .setType(card.getType())
                .setId((int) card.getId())
                .build());
        responseStream.onCompleted();
    }

    @Override
    public void getAllSockCards(Empty request, StreamObserver<productCard> responseStream) {
        System.out.println("Received req to get all sock card");
        List<ProductCard> sockCards = service.getAllSockCards();

        for (ProductCard cards : sockCards) {
            productCard protoCard = productCard.newBuilder()
                    .setId((int)cards.getId())
                    .setTitle(cards.getTitle())
                    .setBrand(cards.getBrand())
                    .setImage(cards.getImage())
                    .setMaterial(cards.getMaterial())
                    .setPrice(cards.getPrice())
                    .setDescription(cards.getDescription())
                    .setType(cards.getType())
                    .build();
            responseStream.onCompleted();
        }
    }

    @Override
    public void getAllTrouserCards(Empty request, StreamObserver<productCard> responseStream) {
        System.out.println("Received req to get all trouser cards");
        List<ProductCard> trouserCards = service.getAllTrouserCards();

        for (ProductCard cards : trouserCards) {
            productCard protoCard = productCard.newBuilder()
                    .setId((int)cards.getId())
                    .setTitle(cards.getTitle())
                    .setBrand(cards.getBrand())
                    .setImage(cards.getImage())
                    .setMaterial(cards.getMaterial())
                    .setPrice(cards.getPrice())
                    .setDescription(cards.getDescription())
                    .setType(cards.getType())
                    .build();
            responseStream.onCompleted();
        }
    }

    @Override
    public void deleteProductCardById(IntReqCard request, StreamObserver<productCard> responseStream) {
        System.out.println("Received req to delete product card with id: " + request.getRequest());
        ProductCard productCard = service.deleteByCardId(request.getRequest());
        responseStream.onNext(ProductCardComunicator.productCard.newBuilder()
                .setTitle(productCard.getTitle())
                .setDescription(productCard.getDescription())
                .setPrice(productCard.getPrice())
                .setMaterial(productCard.getMaterial())
                .setBrand(productCard.getBrand())
                .setImage(productCard.getImage())
                .setType(productCard.getType())
                .build());
        responseStream.onCompleted();
    }

    @Override
    public void getByTitleSockCard(StringReqCard request, StreamObserver<productCard> responseStream) {
        System.out.println("Received req to get sock card with title: " + request.getRequest());
        ProductCard card = service.getByTitleSockCard(request.getRequest());
        responseStream.onNext(productCard.newBuilder()
                .setTitle(card.getTitle())
                .setDescription(card.getDescription())
                .setPrice(card.getPrice())
                .setMaterial(card.getMaterial())
                .setBrand(card.getBrand())
                .setImage(card.getImage())
                .setType(card.getType())
                .setId((int) card.getId())
                .build());
        responseStream.onCompleted();
    }

    @Override
    public void getByTitleTrouserCard(StringReqCard request, StreamObserver<productCard> responseStream) {
        System.out.println("Received req to get trouser card with title: " + request.getRequest());
        ProductCard card = service.getByTitleTrouserCard(request.getRequest());
        responseStream.onNext(productCard.newBuilder()
                .setTitle(card.getTitle())
                .setDescription(card.getDescription())
                .setPrice(card.getPrice())
                .setMaterial(card.getMaterial())
                .setBrand(card.getBrand())
                .setImage(card.getImage())
                .setType(card.getType())
                .setId((int) card.getId())
                .build());
        responseStream.onCompleted();
    }

    @Override
    public void updateCard(productCard request, StreamObserver<productCard> responseStream) {
        System.out.println("Received req to update product card with id: " + request.getId());
        ProductCard productCard = service.getById(request.getId());
        service.updateSockCard(productCard);
        responseStream.onNext(ProductCardComunicator.productCard.newBuilder()
                .setTitle(productCard.getTitle())
                .setDescription(productCard.getDescription())
                .setPrice(productCard.getPrice())
                .setMaterial(productCard.getMaterial())
                .setBrand(productCard.getBrand())
                .setImage(productCard.getImage())
                .setType(productCard.getType())
                .setId((int) productCard.getId())
                .build());
        responseStream.onCompleted();
    }
}

