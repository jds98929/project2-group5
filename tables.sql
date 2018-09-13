
SET SCHEMA 'nfl';

CREATE TABLE nfl.team
(
    team_id serial NOT NULL,
    name character varying NOT NULL,
    logo character varying,
    CONSTRAINT team_pkey PRIMARY KEY (team_id)
)
CREATE TABLE nfl."user"
(
    user_id serial NOT NULL,
    username character varying(20) NOT NULL,
    password character varying(20) NOT NULL,
    first_name character varying(20),
    last_name character varying(20) NOT NULL,
    CONSTRAINT user_pkey PRIMARY KEY (user_id)
)
CREATE TABLE nfl.users_tables
(
    user_id integer NOT NULL,
    team_id integer NOT NULL,
    CONSTRAINT users_tables_pkey PRIMARY KEY (user_id, team_id)
)