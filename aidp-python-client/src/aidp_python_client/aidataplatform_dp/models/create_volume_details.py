# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateVolumeDetails(object):
    """
    The data to create a volume.
    """

    #: A constant which can be used with the volume_type property of a CreateVolumeDetails.
    #: This constant has a value of "MANAGED"
    VOLUME_TYPE_MANAGED = "MANAGED"

    #: A constant which can be used with the volume_type property of a CreateVolumeDetails.
    #: This constant has a value of "EXTERNAL"
    VOLUME_TYPE_EXTERNAL = "EXTERNAL"

    def __init__(self, **kwargs):
        """
        Initializes a new CreateVolumeDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this CreateVolumeDetails.
        :type display_name: str

        :param catalog_name:
            The value to assign to the catalog_name property of this CreateVolumeDetails.
        :type catalog_name: str

        :param schema_name:
            The value to assign to the schema_name property of this CreateVolumeDetails.
        :type schema_name: str

        :param description:
            The value to assign to the description property of this CreateVolumeDetails.
        :type description: str

        :param volume_type:
            The value to assign to the volume_type property of this CreateVolumeDetails.
            Allowed values for this property are: "MANAGED", "EXTERNAL"
        :type volume_type: str

        :param storage_location:
            The value to assign to the storage_location property of this CreateVolumeDetails.
        :type storage_location: str

        """
        self.swagger_types = {
            'display_name': 'str',
            'catalog_name': 'str',
            'schema_name': 'str',
            'description': 'str',
            'volume_type': 'str',
            'storage_location': 'str'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'catalog_name': 'catalogName',
            'schema_name': 'schemaName',
            'description': 'description',
            'volume_type': 'volumeType',
            'storage_location': 'storageLocation'
        }

        self._display_name = None
        self._catalog_name = None
        self._schema_name = None
        self._description = None
        self._volume_type = None
        self._storage_location = None

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this CreateVolumeDetails.
        A user-friendly name. Has to be unique within the schema and is changeable.


        :return: The display_name of this CreateVolumeDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this CreateVolumeDetails.
        A user-friendly name. Has to be unique within the schema and is changeable.


        :param display_name: The display_name of this CreateVolumeDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def catalog_name(self):
        """
        **[Required]** Gets the catalog_name of this CreateVolumeDetails.
        The name of the catalog to which this volume belongs.


        :return: The catalog_name of this CreateVolumeDetails.
        :rtype: str
        """
        return self._catalog_name

    @catalog_name.setter
    def catalog_name(self, catalog_name):
        """
        Sets the catalog_name of this CreateVolumeDetails.
        The name of the catalog to which this volume belongs.


        :param catalog_name: The catalog_name of this CreateVolumeDetails.
        :type: str
        """
        self._catalog_name = catalog_name

    @property
    def schema_name(self):
        """
        **[Required]** Gets the schema_name of this CreateVolumeDetails.
        The name of the schema to which this volume belongs.


        :return: The schema_name of this CreateVolumeDetails.
        :rtype: str
        """
        return self._schema_name

    @schema_name.setter
    def schema_name(self, schema_name):
        """
        Sets the schema_name of this CreateVolumeDetails.
        The name of the schema to which this volume belongs.


        :param schema_name: The schema_name of this CreateVolumeDetails.
        :type: str
        """
        self._schema_name = schema_name

    @property
    def description(self):
        """
        Gets the description of this CreateVolumeDetails.
        Short description of the volume


        :return: The description of this CreateVolumeDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CreateVolumeDetails.
        Short description of the volume


        :param description: The description of this CreateVolumeDetails.
        :type: str
        """
        self._description = description

    @property
    def volume_type(self):
        """
        Gets the volume_type of this CreateVolumeDetails.
        The type of volume.

        Allowed values for this property are: "MANAGED", "EXTERNAL"


        :return: The volume_type of this CreateVolumeDetails.
        :rtype: str
        """
        return self._volume_type

    @volume_type.setter
    def volume_type(self, volume_type):
        """
        Sets the volume_type of this CreateVolumeDetails.
        The type of volume.


        :param volume_type: The volume_type of this CreateVolumeDetails.
        :type: str
        """
        allowed_values = ["MANAGED", "EXTERNAL"]
        if not value_allowed_none_or_none_sentinel(volume_type, allowed_values):
            raise ValueError(
                "Invalid value for `volume_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._volume_type = volume_type

    @property
    def storage_location(self):
        """
        Gets the storage_location of this CreateVolumeDetails.
        The storage location of the external volume. Only applicable for external volumes.


        :return: The storage_location of this CreateVolumeDetails.
        :rtype: str
        """
        return self._storage_location

    @storage_location.setter
    def storage_location(self, storage_location):
        """
        Sets the storage_location of this CreateVolumeDetails.
        The storage location of the external volume. Only applicable for external volumes.


        :param storage_location: The storage_location of this CreateVolumeDetails.
        :type: str
        """
        self._storage_location = storage_location

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
