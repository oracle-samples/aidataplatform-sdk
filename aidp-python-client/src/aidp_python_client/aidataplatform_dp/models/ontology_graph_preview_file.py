# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyGraphPreviewFile(object):
    """
    Source file metadata for a design-time ontology graph preview.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyGraphPreviewFile object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param path:
            The value to assign to the path property of this OntologyGraphPreviewFile.
        :type path: str

        :param size_bytes:
            The value to assign to the size_bytes property of this OntologyGraphPreviewFile.
        :type size_bytes: int

        :param etag:
            The value to assign to the etag property of this OntologyGraphPreviewFile.
        :type etag: str

        :param revision:
            The value to assign to the revision property of this OntologyGraphPreviewFile.
        :type revision: str

        """
        self.swagger_types = {
            'path': 'str',
            'size_bytes': 'int',
            'etag': 'str',
            'revision': 'str'
        }

        self.attribute_map = {
            'path': 'path',
            'size_bytes': 'sizeBytes',
            'etag': 'etag',
            'revision': 'revision'
        }

        self._path = None
        self._size_bytes = None
        self._etag = None
        self._revision = None

    @property
    def path(self):
        """
        **[Required]** Gets the path of this OntologyGraphPreviewFile.
        Project-relative file path.


        :return: The path of this OntologyGraphPreviewFile.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this OntologyGraphPreviewFile.
        Project-relative file path.


        :param path: The path of this OntologyGraphPreviewFile.
        :type: str
        """
        self._path = path

    @property
    def size_bytes(self):
        """
        Gets the size_bytes of this OntologyGraphPreviewFile.
        File size in bytes.


        :return: The size_bytes of this OntologyGraphPreviewFile.
        :rtype: int
        """
        return self._size_bytes

    @size_bytes.setter
    def size_bytes(self, size_bytes):
        """
        Sets the size_bytes of this OntologyGraphPreviewFile.
        File size in bytes.


        :param size_bytes: The size_bytes of this OntologyGraphPreviewFile.
        :type: int
        """
        self._size_bytes = size_bytes

    @property
    def etag(self):
        """
        Gets the etag of this OntologyGraphPreviewFile.
        File etag used for cache invalidation.


        :return: The etag of this OntologyGraphPreviewFile.
        :rtype: str
        """
        return self._etag

    @etag.setter
    def etag(self, etag):
        """
        Sets the etag of this OntologyGraphPreviewFile.
        File etag used for cache invalidation.


        :param etag: The etag of this OntologyGraphPreviewFile.
        :type: str
        """
        self._etag = etag

    @property
    def revision(self):
        """
        Gets the revision of this OntologyGraphPreviewFile.
        File revision used for cache invalidation.


        :return: The revision of this OntologyGraphPreviewFile.
        :rtype: str
        """
        return self._revision

    @revision.setter
    def revision(self, revision):
        """
        Sets the revision of this OntologyGraphPreviewFile.
        File revision used for cache invalidation.


        :param revision: The revision of this OntologyGraphPreviewFile.
        :type: str
        """
        self._revision = revision

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
