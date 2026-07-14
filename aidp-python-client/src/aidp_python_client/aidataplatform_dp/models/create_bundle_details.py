# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateBundleDetails(object):
    """
    Request body to create a new bundle.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateBundleDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this CreateBundleDetails.
        :type name: str

        :param description:
            The value to assign to the description property of this CreateBundleDetails.
        :type description: str

        :param path:
            The value to assign to the path property of this CreateBundleDetails.
        :type path: str

        :param bundled_resources:
            The value to assign to the bundled_resources property of this CreateBundleDetails.
        :type bundled_resources: list[oci.aidataplatform_dp.models.BundledResource]

        """
        self.swagger_types = {
            'name': 'str',
            'description': 'str',
            'path': 'str',
            'bundled_resources': 'list[BundledResource]'
        }

        self.attribute_map = {
            'name': 'name',
            'description': 'description',
            'path': 'path',
            'bundled_resources': 'bundledResources'
        }

        self._name = None
        self._description = None
        self._path = None
        self._bundled_resources = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this CreateBundleDetails.
        Name for the new bundle.


        :return: The name of this CreateBundleDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this CreateBundleDetails.
        Name for the new bundle.


        :param name: The name of this CreateBundleDetails.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this CreateBundleDetails.
        Description for the bundle.


        :return: The description of this CreateBundleDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CreateBundleDetails.
        Description for the bundle.


        :param description: The description of this CreateBundleDetails.
        :type: str
        """
        self._description = description

    @property
    def path(self):
        """
        **[Required]** Gets the path of this CreateBundleDetails.
        Target folder for the new bundle.


        :return: The path of this CreateBundleDetails.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this CreateBundleDetails.
        Target folder for the new bundle.


        :param path: The path of this CreateBundleDetails.
        :type: str
        """
        self._path = path

    @property
    def bundled_resources(self):
        """
        Gets the bundled_resources of this CreateBundleDetails.
        List of workspace resource descriptors (jobs, agentflows) to be included.
        Each has minimally resourceType and resourceKey.


        :return: The bundled_resources of this CreateBundleDetails.
        :rtype: list[oci.aidataplatform_dp.models.BundledResource]
        """
        return self._bundled_resources

    @bundled_resources.setter
    def bundled_resources(self, bundled_resources):
        """
        Sets the bundled_resources of this CreateBundleDetails.
        List of workspace resource descriptors (jobs, agentflows) to be included.
        Each has minimally resourceType and resourceKey.


        :param bundled_resources: The bundled_resources of this CreateBundleDetails.
        :type: list[oci.aidataplatform_dp.models.BundledResource]
        """
        self._bundled_resources = bundled_resources

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
