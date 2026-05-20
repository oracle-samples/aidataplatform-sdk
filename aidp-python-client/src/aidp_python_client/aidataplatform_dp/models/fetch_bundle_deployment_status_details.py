# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class FetchBundleDeploymentStatusDetails(object):
    """
    Request payload for fetch BundleDeploymentStatus.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new FetchBundleDeploymentStatusDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param path:
            The value to assign to the path property of this FetchBundleDeploymentStatusDetails.
        :type path: str

        """
        self.swagger_types = {
            'path': 'str'
        }

        self.attribute_map = {
            'path': 'path'
        }

        self._path = None

    @property
    def path(self):
        """
        **[Required]** Gets the path of this FetchBundleDeploymentStatusDetails.
        Target folder for the new bundle.


        :return: The path of this FetchBundleDeploymentStatusDetails.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this FetchBundleDeploymentStatusDetails.
        Target folder for the new bundle.


        :param path: The path of this FetchBundleDeploymentStatusDetails.
        :type: str
        """
        self._path = path

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
