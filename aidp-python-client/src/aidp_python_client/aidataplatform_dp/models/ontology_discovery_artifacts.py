# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyDiscoveryArtifacts(object):
    """
    Workspace-volume location and contents of discovery artifacts.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyDiscoveryArtifacts object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param volume_key:
            The value to assign to the volume_key property of this OntologyDiscoveryArtifacts.
        :type volume_key: str

        :param folder:
            The value to assign to the folder property of this OntologyDiscoveryArtifacts.
        :type folder: str

        :param items:
            The value to assign to the items property of this OntologyDiscoveryArtifacts.
        :type items: list[oci.aidataplatform_dp.models.OntologyDiscoveryArtifactItem]

        """
        self.swagger_types = {
            'volume_key': 'str',
            'folder': 'str',
            'items': 'list[OntologyDiscoveryArtifactItem]'
        }
        self.attribute_map = {
            'volume_key': 'volumeKey',
            'folder': 'folder',
            'items': 'items'
        }
        self._volume_key = None
        self._folder = None
        self._items = None

    @property
    def volume_key(self):
        """
        Gets the volume_key of this OntologyDiscoveryArtifacts.
        Artifact volume key.


        :return: The volume_key of this OntologyDiscoveryArtifacts.
        :rtype: str
        """
        return self._volume_key

    @volume_key.setter
    def volume_key(self, volume_key):
        """
        Sets the volume_key of this OntologyDiscoveryArtifacts.
        Artifact volume key.


        :param volume_key: The volume_key of this OntologyDiscoveryArtifacts.
        :type: str
        """
        self._volume_key = volume_key

    @property
    def folder(self):
        """
        Gets the folder of this OntologyDiscoveryArtifacts.
        Artifact folder path.


        :return: The folder of this OntologyDiscoveryArtifacts.
        :rtype: str
        """
        return self._folder

    @folder.setter
    def folder(self, folder):
        """
        Sets the folder of this OntologyDiscoveryArtifacts.
        Artifact folder path.


        :param folder: The folder of this OntologyDiscoveryArtifacts.
        :type: str
        """
        self._folder = folder

    @property
    def items(self):
        """
        Gets the items of this OntologyDiscoveryArtifacts.
        Discovery artifacts.


        :return: The items of this OntologyDiscoveryArtifacts.
        :rtype: list[oci.aidataplatform_dp.models.OntologyDiscoveryArtifactItem]
        """
        return self._items

    @items.setter
    def items(self, items):
        """
        Sets the items of this OntologyDiscoveryArtifacts.
        Discovery artifacts.


        :param items: The items of this OntologyDiscoveryArtifacts.
        :type: list[oci.aidataplatform_dp.models.OntologyDiscoveryArtifactItem]
        """
        self._items = items

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
