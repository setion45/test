CREATE TABLE client
(
    id               bigint      NOT NULL IDENTITY,
    name             varchar(50) NOT NULL,
    telephone_number varchar(50) NOT NULL,
    email            varchar(50) NOT NULL,
    passport_number  varchar(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE credit
(
    id            bigint      NOT NULL IDENTITY,
    limit         varchar(50) NOT NULL,
    interest_rate varchar(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE credit_offer
(
    id        bigint      NOT NULL IDENTITY,
    client_id bigint      NOT NULL,
    credit_id bigint      NOT NULL,
    amount    varchar(50) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (client_id) REFERENCES client (id),
    FOREIGN KEY (credit_id) REFERENCES credit (id)
);

CREATE TABLE payment_plan
(
    id              bigint      NOT NULL IDENTITY,
    date            varchar(50) NOT NULL,
    amount          varchar(50) NOT NULL,
    debt            varchar(50) NOT NULL,
    percentage      varchar(50) NOT NULL,
    credit_offer_id bigint      NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (credit_offer_id) REFERENCES credit_offer (id)
);