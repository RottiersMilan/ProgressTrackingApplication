INSERT INTO song (title, artist, has_acoustic, has_electric)
SELECT t.title, t.artist, t.has_acoustic, t.has_electric
FROM (
    SELECT
        'revolution' AS title,
        'The Beatles' AS artist,
        false AS has_acoustic,
        true AS has_electric

    UNION ALL SELECT
        'twist and shout',
        'The Beatles',
        true,
        true

    UNION ALL SELECT
        'drive my car',
        'The Beatles',
        false,
        true

    UNION ALL SELECT
        'sultan of swing',
        'Dire Straits',
        false,
        true
) AS t
WHERE NOT EXISTS (
    SELECT 1
    FROM song s
    WHERE s.title = t.title
      AND s.artist = t.artist
);