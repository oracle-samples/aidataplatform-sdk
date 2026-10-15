# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyDiscoveryArtifactItem(object):
    """
    A single artifact produced by an ontology discovery job.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyDiscoveryArtifactItem object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this OntologyDiscoveryArtifactItem.
        :type name: str

        :param path:
            The value to assign to the path property of this OntologyDiscoveryArtifactItem.
        :type path: str

        :param kind:
            The value to assign to the kind property of this OntologyDiscoveryArtifactItem.
        :type kind: str

        :param class_name:
            The value to assign to the class_name property of this OntologyDiscoveryArtifactItem.
        :type class_name: str

        :param bytes:
            The value to assign to the bytes property of this OntologyDiscoveryArtifactItem.
        :type bytes: int

        :param sha256:
            The value to assign to the sha256 property of this OntologyDiscoveryArtifactItem.
        :type sha256: str

        """
        self.swagger_types = {
            'name': 'str',
            'path': 'str',
            'kind': 'str',
            'class_name': 'str',
            'bytes': 'int',
            'sha256': 'str'
        }
        self.attribute_map = {
            'name': 'name',
            'path': 'path',
            'kind': 'kind',
            'class_name': 'className',
            'bytes': 'bytes',
            'sha256': 'sha256'
        }
        self._name = None
        self._path = None
        self._kind = None
        self._class_name = None
        self._bytes = None
        self._sha256 = None

    @property
    def name(self):
        """
        Gets the name of this OntologyDiscoveryArtifactItem.
        Artifact file name.


        :return: The name of this OntologyDiscoveryArtifactItem.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this OntologyDiscoveryArtifactItem.
        Artifact file name.


        :param name: The name of this OntologyDiscoveryArtifactItem.
        :type: str
        """
        self._name = name

    @property
    def path(self):
        """
        Gets the path of this OntologyDiscoveryArtifactItem.
        Artifact file path.


        :return: The path of this OntologyDiscoveryArtifactItem.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this OntologyDiscoveryArtifactItem.
        Artifact file path.


        :param path: The path of this OntologyDiscoveryArtifactItem.
        :type: str
        """
        self._path = path

    @property
    def kind(self):
        """
        Gets the kind of this OntologyDiscoveryArtifactItem.
        Artifact type.


        :return: The kind of this OntologyDiscoveryArtifactItem.
        :rtype: str
        """
        return self._kind

    @kind.setter
    def kind(self, kind):
        """
        Sets the kind of this OntologyDiscoveryArtifactItem.
        Artifact type.


        :param kind: The kind of this OntologyDiscoveryArtifactItem.
        :type: str
        """
        self._kind = kind

    @property
    def class_name(self):
        """
        Gets the class_name of this OntologyDiscoveryArtifactItem.
        Owning ontology class.


        :return: The class_name of this OntologyDiscoveryArtifactItem.
        :rtype: str
        """
        return self._class_name

    @class_name.setter
    def class_name(self, class_name):
        """
        Sets the class_name of this OntologyDiscoveryArtifactItem.
        Owning ontology class.


        :param class_name: The class_name of this OntologyDiscoveryArtifactItem.
        :type: str
        """
        self._class_name = class_name

    @property
    def bytes(self):
        """
        Gets the bytes of this OntologyDiscoveryArtifactItem.
        Artifact size in bytes.


        :return: The bytes of this OntologyDiscoveryArtifactItem.
        :rtype: int
        """
        return self._bytes

    @bytes.setter
    def bytes(self, bytes):
        """
        Sets the bytes of this OntologyDiscoveryArtifactItem.
        Artifact size in bytes.


        :param bytes: The bytes of this OntologyDiscoveryArtifactItem.
        :type: int
        """
        self._bytes = bytes

    @property
    def sha256(self):
        """
        Gets the sha256 of this OntologyDiscoveryArtifactItem.
        Artifact checksum.


        :return: The sha256 of this OntologyDiscoveryArtifactItem.
        :rtype: str
        """
        return self._sha256

    @sha256.setter
    def sha256(self, sha256):
        """
        Sets the sha256 of this OntologyDiscoveryArtifactItem.
        Artifact checksum.


        :param sha256: The sha256 of this OntologyDiscoveryArtifactItem.
        :type: str
        """
        self._sha256 = sha256

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
