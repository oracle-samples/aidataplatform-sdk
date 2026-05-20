# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CatalogMigrationDetail(object):
    """
    Summary information about a catalog.
    """

    #: A constant which can be used with the status property of a CatalogMigrationDetail.
    #: This constant has a value of "SUCCESS"
    STATUS_SUCCESS = "SUCCESS"

    #: A constant which can be used with the status property of a CatalogMigrationDetail.
    #: This constant has a value of "FAILED"
    STATUS_FAILED = "FAILED"

    def __init__(self, **kwargs):
        """
        Initializes a new CatalogMigrationDetail object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this CatalogMigrationDetail.
        :type key: str

        :param catalog_name:
            The value to assign to the catalog_name property of this CatalogMigrationDetail.
        :type catalog_name: str

        :param catalog_type:
            The value to assign to the catalog_type property of this CatalogMigrationDetail.
        :type catalog_type: str

        :param status:
            The value to assign to the status property of this CatalogMigrationDetail.
            Allowed values for this property are: "SUCCESS", "FAILED"
        :type status: str

        :param failure_msg:
            The value to assign to the failure_msg property of this CatalogMigrationDetail.
        :type failure_msg: str

        """
        self.swagger_types = {
            'key': 'str',
            'catalog_name': 'str',
            'catalog_type': 'str',
            'status': 'str',
            'failure_msg': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'catalog_name': 'catalogName',
            'catalog_type': 'catalogType',
            'status': 'status',
            'failure_msg': 'failureMsg'
        }

        self._key = None
        self._catalog_name = None
        self._catalog_type = None
        self._status = None
        self._failure_msg = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this CatalogMigrationDetail.
        catalog key


        :return: The key of this CatalogMigrationDetail.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this CatalogMigrationDetail.
        catalog key


        :param key: The key of this CatalogMigrationDetail.
        :type: str
        """
        self._key = key

    @property
    def catalog_name(self):
        """
        **[Required]** Gets the catalog_name of this CatalogMigrationDetail.
        catalog Name


        :return: The catalog_name of this CatalogMigrationDetail.
        :rtype: str
        """
        return self._catalog_name

    @catalog_name.setter
    def catalog_name(self, catalog_name):
        """
        Sets the catalog_name of this CatalogMigrationDetail.
        catalog Name


        :param catalog_name: The catalog_name of this CatalogMigrationDetail.
        :type: str
        """
        self._catalog_name = catalog_name

    @property
    def catalog_type(self):
        """
        **[Required]** Gets the catalog_type of this CatalogMigrationDetail.
        catalog type


        :return: The catalog_type of this CatalogMigrationDetail.
        :rtype: str
        """
        return self._catalog_type

    @catalog_type.setter
    def catalog_type(self, catalog_type):
        """
        Sets the catalog_type of this CatalogMigrationDetail.
        catalog type


        :param catalog_type: The catalog_type of this CatalogMigrationDetail.
        :type: str
        """
        self._catalog_type = catalog_type

    @property
    def status(self):
        """
        **[Required]** Gets the status of this CatalogMigrationDetail.
        migration result status

        Allowed values for this property are: "SUCCESS", "FAILED"


        :return: The status of this CatalogMigrationDetail.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this CatalogMigrationDetail.
        migration result status


        :param status: The status of this CatalogMigrationDetail.
        :type: str
        """
        allowed_values = ["SUCCESS", "FAILED"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            raise ValueError(
                "Invalid value for `status`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._status = status

    @property
    def failure_msg(self):
        """
        Gets the failure_msg of this CatalogMigrationDetail.
        Failure msg if failed else null


        :return: The failure_msg of this CatalogMigrationDetail.
        :rtype: str
        """
        return self._failure_msg

    @failure_msg.setter
    def failure_msg(self, failure_msg):
        """
        Sets the failure_msg of this CatalogMigrationDetail.
        Failure msg if failed else null


        :param failure_msg: The failure_msg of this CatalogMigrationDetail.
        :type: str
        """
        self._failure_msg = failure_msg

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
