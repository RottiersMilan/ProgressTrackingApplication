INSERT INTO song (title, artist, link, has_acoustic, has_electric)
SELECT t.title, t.artist, t.link, t.has_acoustic, t.has_electric
FROM (
    SELECT
        'revolution' AS title,
        'The Beatles' AS artist,
        'https://www.youtube.com/watch?v=lgpRiWZ7TGo' AS link,
        false AS has_acoustic,
        true AS has_electric

    UNION ALL SELECT
        'twist and shout',
        'The Beatles',
        'https://www.youtube.com/watch?v=ZbYW3qlrlHE',
        true,
        true

    UNION ALL SELECT
        'drive my car',
        'The Beatles',
        'https://www.youtube.com/watch?v=3qsXuyiyOsA',
        false,
        true

    UNION ALL SELECT
        'sultan of swing',
        'Dire Straits',
        'https://www.youtube.com/watch?v=HBNwBoOe8aY',
        false,
        true
) AS t
WHERE NOT EXISTS (
    SELECT 1
    FROM song s
    WHERE s.title = t.title
      AND s.artist = t.artist
);